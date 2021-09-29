
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
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Du Lieu: ");
        int a=sc.nextInt();
        if (a>0)
            {
                System.out.println(a + " is positive ");
            }
        else if (a<0)
            {
                System.out.println(a + " is negative");
            }
        else
        {
            System.out.println(a + " is not positive and negative");
        }
    } 
}
