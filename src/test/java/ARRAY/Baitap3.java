/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author KimAnh
 */
public class Baitap3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("NHap vao do dai mang: ");
		int n = input.nextInt();
		int a[] = new int[n];
		double b[] = new double[n];

		rdArr(a, n);
		rdFloatArr(b, n);
		trungbinhtrong(a, b, n);
	}

	public static void rdArr(int[] array, int n) {
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(n);
		}

		System.out.println("Mang vua tao: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void rdFloatArr(double[] array, int n) {
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = (double) Math.round(rd.nextInt(11) * 0.1 * 10) / 10;
		}

		System.out.println("Mang so thuc vua tao: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void trungbinhtrong(int[] a, double[] b, int n) {
		double tbt = 0;

		for (int i = 0; i < n; i++) {
			tbt += a[i] * b[i];
		}

		System.out.print("Trung binh cong cua 2 mang la: " + (double) Math.round((tbt / n) * 100) / 100);
	}
}
