
package LapTrinhChuoi;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String str = scanner.nextLine();
		str = str.replaceAll("\s+", "");
		System.out.println("Chuoi khong co khoang trang: " + str);
		scanner.close();
	}
}
