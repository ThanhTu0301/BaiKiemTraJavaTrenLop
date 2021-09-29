
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
public class Baitap4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Import the number first:");
        int a=sc.nextInt();
        System.out.println("Import the number second:");
        int b=sc.nextInt();
        System.out.println("Import the number third:");
        int c=sc.nextInt();
        System.out.println("Import the number fourth:");
        int d=sc.nextInt();
        System.out.println("Import the number fifth:");
        int e=sc.nextInt();
        int sum, Average;
        sum=a+b+c+d+e;
        Average=sum/5;
        System.out.println("The sum of 5 no is : " +sum);
        System.out.println("The Average is : " +Average);
    }
}
