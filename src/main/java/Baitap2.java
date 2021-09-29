
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
public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The first number is: ");
        int a=sc.nextInt();
        System.out.println("The second number is: ");
        int b=sc.nextInt();
        System.out.println("The third number is: ");
        int c=sc.nextInt();
        if((a>b)&&(b>c))
            {
                System.out.println(a + " is the greatest");
            }
        else if ((b>a) && (b>c))
            {
                System.out.println(b + " is the greatest");
            }
        else 
            {
                System.out.println(c + " is the greatest");
            }
    }
}
