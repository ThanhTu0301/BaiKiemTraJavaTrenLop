
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Baitap3_2 {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Import the year: ");
        long n = sc.nextLong();
	if(n % 100 == 0 && n % 400 != 0) {
		System.out.print("none");
	}else if(n % 4 ==0) {
		System.out.print("leap year");
	}
	else {
		System.out.print("none");
	}
            System.out.println();
    }
}
