/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luutru;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectOutputStreamCar {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ten xe: ");
		String name = input.nextLine();
		System.out.print("Nhap ten dong co: ");
		String engine = input.nextLine();
		System.out.print("Nhap ngay san xuat: ");
		String production_date = input.nextLine();
		System.out.print("Nhap so ghe ngoi: ");
		int seats = input.nextInt();

		try {
			oos = new ObjectOutputStream(new FileOutputStream("D:/carfile.txt"));
			Car cars = new Car(name, engine, seats, production_date);
			oos.writeObject(cars);
			System.out.println("Thanh cong");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			oos.close();
		}
	}
}
