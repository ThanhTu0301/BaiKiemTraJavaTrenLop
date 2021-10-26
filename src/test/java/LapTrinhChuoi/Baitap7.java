
package LapTrinhChuoi;

import java.util.Scanner;
public class Baitap7 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuoi: ");
		String string = scanner.nextLine();
		String stringReverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			stringReverse += string.charAt(i);
		}
		System.out.println("Sau nghich dao: " + stringReverse);
	}

}
