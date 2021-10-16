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
public class Baitap4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao do dai mang: ");
		int l = input.nextInt();
		int arr[] = new int[l];
		rdArr(arr, l);
		inArr(arr, l);
		int temp[] = new int[l];
		for (int i = 0; i < l; i++) {
			temp[i] = arr[i];
		}
		sortASC(temp, l);
		sortDESC(temp, l);
		System.out.print("Nhap phan tu can tim: ");
		int n = input.nextInt();
		findN1(arr, n);
		findN2(arr, n);
	}

	public static void rdArr(int[] arr, int l) {
		Random rd = new Random();

		for (int i = 0; i < l; i++) {
			arr[i] = rd.nextInt(l);
		}

		System.out.println("Mang vua tao ngau nhien: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void inArr(int[] arr, int l) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap cac phan tu cua mang co dai bang " + l + " : ");
		for (int i = 0; i < l; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Mang vua nhap: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void sortASC(int[] arr, int l) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Mang sap xep theo chieu tang dan: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void sortDESC(int[] arr, int l) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Mang sap xep theo chieu giam dan: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void findN1(int[] arr, int n) {
		int count = 0;
		int tmpvt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (count == 0) {
					tmpvt = i;
					count++;
				} else {
					count += 0;
				}
			} else {
				count += 0;
			}
		}
		if (count == 1) {
			System.out.println("Vi tri xuat hien dau tien: ");
			System.out.println(n + " xuat hien tai vi tri " + tmpvt);
		} else {
			System.out.println(-1);
		}
		System.out.println("\n");
	}

	public static void findN2(int[] arr, int n) {
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
