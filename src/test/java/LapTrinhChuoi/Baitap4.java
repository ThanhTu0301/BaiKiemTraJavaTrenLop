
package LapTrinhChuoi;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuoi: ");
		String string = scanner.nextLine();
		String word[] = string.split("\\s+");
		System.out.println("Cac chuoi tach duoc: ");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
}
