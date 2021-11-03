/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author KimAnh
 */


public class BusinessPerson extends Person implements Tax {
	private String name, citizenID, phone, email;
	private double salary, business_income, other_income;

	public BusinessPerson() {
		super();
	}

	public BusinessPerson(String birthday, String gender, String blood_type, String name, String citizenID,
			String phone, String email, double salary, double business_income, double other_income) {
		super(birthday, gender, blood_type);
		this.name = name;
		this.citizenID = citizenID;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.business_income = business_income;
		this.other_income = other_income;
	}

	public void Input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("citizenID = ");
		citizenID = scanner.nextLine();
		System.out.print("name = ");
		name = scanner.nextLine();
		System.out.print("phone = ");
		phone = scanner.nextLine();
		System.out.print("email = ");
		email = scanner.nextLine();
		System.out.print("salary = ");
		salary = scanner.nextDouble();
		System.out.print("business income = ");
		business_income = scanner.nextDouble();
		System.out.print("other income = ");
		other_income = scanner.nextDouble();
		this.InputPerson();
		System.out.println();
		// scanner.close();
	}

	public void Output() {
		System.out.println("citizenID is " + this.getCitizenID());
		System.out.println("name is " + this.getName());
		System.out.println("phone is " + this.getPhone());
		System.out.println("email is " + this.getEmail());
		System.out.println("salary is " + this.getSalary() + " VND");
		System.out.println("business income is " + this.getBusiness_income() + " VND");
		System.out.println("orther income is " + this.getOther_income() + " VND");
		System.out.println("birthday is " + this.getBirthday());
		System.out.println("gender is " + this.isGender());
		System.out.println("blood type is " + this.getBlood_type());
		// System.out.println("Tax is " + this.payTax(60000000, 1, 6) + " VND");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
	}

	public String getPhone() {
		// check format phone number VietNam
		final String PHONE_PATTERN = "^(84|0[3|5|7|8|9])+([0-9]{8})\\b$";
		if (Pattern.matches(PHONE_PATTERN, phone)) {
			return phone;
		} else {
			return "invalid !";
		}

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		// check format email
		final String EMAIL_PATTERN = "^[\\w+][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
		if (Pattern.matches(EMAIL_PATTERN, email)) {
			return email;
		} else {
			return "invalid !";
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBusiness_income() {
		return business_income;
	}

	public void setBusiness_income(double business_income) {
		this.business_income = business_income;
	}

	public double getOther_income() {
		return other_income;
	}

	public void setOther_income(double other_income) {
		this.other_income = other_income;
	}

	@Override
	public double payTax(double income, int start_time, int end_time) {
		long income_50 = (long) (50 * Math.pow(10, 6));
		long income_10 = (long) (10 * Math.pow(10, 6));
		double percentTax = (income > income_50) ? (3.0 / 100)
				: ((income > income_10 && income <= income_50) ? (2.0 / 100) : 0);
		double TaxBusinessPerson = income * percentTax * Math.abs(end_time - start_time);
		return TaxBusinessPerson;
	}
}
