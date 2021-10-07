
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
public class Baitap3 {
    public static void main(String[] args) {
	            int n,sothuN=1;
	            int f0=1;
	            int f1=1;
	            Scanner input = new Scanner(System.in);
	            System.out.println("Import the number:");
	            n = input.nextInt();
	            if (n>1) {
	                for (int i = 2; i <=n; i++) {
	                    sothuN=f0+f1;
	                    f0=f1;
	                    f1=sothuN;
	                }
	        }
	        System.out.println("The number of "+n +" is " + sothuN);
	    }
}
