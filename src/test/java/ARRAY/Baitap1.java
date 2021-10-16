/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

import java.util.Scanner;
/**
 *
 * @author KimAnh
 */
public class Baitap1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao so phan tu cua mang: ");
		int n = input.nextInt();

		int array[] = new int[n];

		nhapArr(array, n);
		trungbinhcong(array, n);
	}

	public static void nhapArr(int[] array, int n) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("\nMang vua nhapp: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void trungbinhcong(int[] array, int n) {
		double avg = 0;
		for (int i = 0; i < n; i++) {
			avg += array[i];
		}
		System.out.print("\nTrung binh cong = " + (double) Math.round((avg / n) * 100) / 100);
	}
}
