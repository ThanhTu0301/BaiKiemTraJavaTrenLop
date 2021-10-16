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
public class Baitap2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao do dai mang: ");
		int n = input.nextInt();

		int array[] = new int[n];

		rdArr(array, n);
		trungbinhcong(array, n);
	}

	public static void rdArr(int[] array, int n) {
		Scanner input = new Scanner(System.in);

		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(n);
		}

		System.out.println("\nMang vua tao: ");
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
