
import java.util.Scanner;
public class BaiTapSlide26{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SINGLE = 1;
		final int ER = 2;
		final int MFS = 3;
		final int HOH = 4;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 is Single filer");
		System.out.println("2 is married file jointly");
		System.out.println("3 is married file separately");
		System.out.println("4 is tax for head of household");
		
		System.out.print("Status of you: ");
		int status = scanner.nextInt();
		System.out.print("Income of you: ");
		double income = scanner.nextDouble();
		
		double tax = 0;
		if (income >0 && income <= 8.350) {
			tax = income * 10;
		} else if (income >8.351 && income <= 33.950) {
			tax = income * 15;
		}else if (income >33.951 && income <= 82.250) {
			tax = income * 25;
		}else if (income >82.251 && income <= 171.550) {
			tax = income * 28;
		}else if (income >171.551 && income <= 372.950) {
			tax = income * 33;
		}else  {
			tax = income * 35;
		}
		if (status == SINGLE) {
			System.out.print("Tax for single filers: " + (tax / 100 ) + " USD" );
		} else if (status == ER) {
			System.out.println("tax for married file jointly: " + (tax / 100 ) + " USD");
		} else if (status == MFS) {
			System.out.println("tax for married file separately: " + (tax / 100 ) + " USD");
		} else if (status == HOH) {
			System.out.println("tax for head of household: " + (tax / 100 ) + " USD");
		} else {
			System.out.println("Wrong status");
		}
		scanner.close();
	}

}