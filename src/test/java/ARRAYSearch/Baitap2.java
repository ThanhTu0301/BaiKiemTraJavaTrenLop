/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSearch;

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
		System.out.print("Nhap vao do dai mang: ");
		int l = input.nextInt();
		int arr[] = new int[l];
		rdArr(arr, l);
		System.out.print("Nhap phan tu can tim: ");
		int n = input.nextInt();
		findN(arr, n);
	}

	public static void rdArr(int[] arr, int l) {
		Random rd = new Random();

		for (int i = 0; i < l; i++) {
			arr[i] = rd.nextInt(l);
		}

		System.out.println("Mang vua tao: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void findN(int[] arr, int n) {
		System.out.println("Cac vi tri xuat hien: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.print(n + " xuat hien tai vi tri " + i + "\n");
			} else {
				System.out.print("");
			}
		}
	}
}
