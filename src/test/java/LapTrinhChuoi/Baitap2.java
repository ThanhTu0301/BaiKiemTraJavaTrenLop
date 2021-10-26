
package LapTrinhChuoi;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String str = scanner.nextLine();
		str = str.trim().toLowerCase();
		str = str.replaceAll("\s+", " ");
		String[] arr = str.split(" ");
		str = "";
		for (int i = 0; i < arr.length; i++) {
			str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
			str += " ";
		}
		System.out.println("Chuoi thay doi: " + str);
	}
}
