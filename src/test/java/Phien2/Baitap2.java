
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phien2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Baitap2 {
    public static void main(String[] args) {
	        int number, temp = 1;
	        long giaiThua = 1;
	         
	        Scanner scanner = new Scanner(System.in);
	         
	        do {
	            System.out.println("Import the number: ");
	            number = scanner.nextInt();
	        } while ((number <= 0) || (number > 10));
	         
	        while (temp <= number) {
	            giaiThua *= temp;
	            temp++;
	        }
	        System.out.println(number + "! = " + giaiThua);
	    }
}
