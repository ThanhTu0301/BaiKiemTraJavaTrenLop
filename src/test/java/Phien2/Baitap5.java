
package Phien2;

import java.util.Scanner;

public class Baitap5 {
    	        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhap n = ");
	        int n = sc.nextInt();
	        System.out.println(n + " so nguyen to đau tien la: ");
	        int dem = 0; 
	        int i = 2;   
	        while (dem < n) {
	            if (isPrimeNumber(i)) {
	                System.out.print(i + " ");
	                dem++;
	            }
	            i++;
	        }
	    }
	    public static boolean isPrimeNumber(int n) {
	        if (n < 2) {
	            return false;
	        }
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
