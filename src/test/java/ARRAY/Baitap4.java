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
public class Baitap4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao do dai mang: ");
		int n = input.nextInt();
		int a[] = new int[n];

		rdArr(a, n);
		inArr(a, n);
		inArrRev(a, n);
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

	public static void inArr(int[] array, int n) {
		System.out.println("In mang theo chieu tu trai sang phai: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void inArrRev(int[] array, int n) {
		System.out.println("In mang theo chieu tu phai sang trai: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}
}
