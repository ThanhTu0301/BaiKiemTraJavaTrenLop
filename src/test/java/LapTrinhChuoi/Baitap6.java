
package LapTrinhChuoi;

import java.util.Scanner;
public class Baitap6 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuoi: ");
		String string = scanner.nextLine();
		String str[] = string.split("\\s+");
		System.out.print("Ky tưu: ");
		String word = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		if (count <= 0) {
			System.out.println(
					"So lan xuat hien cua ky tu \"" + word + "\" la " + count + " - kkhong có vi tri");
		} else {
			System.out.print(
					"Số lan xuat hien cua ky tu \"" + word + "\" la " + count + " xuat hien tai vi tri: ");
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals(word)) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
