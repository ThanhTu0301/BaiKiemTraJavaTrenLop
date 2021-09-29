
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
public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number 1 is: ");
        double a=sc.nextDouble();
        System.out.println("Number 1 is: ");
        double b=sc.nextDouble();
        a = Math.round(a * 1000);
        a = a / 1000;

        b = Math.round(b * 1000);
        b = b / 1000;

        if (a == b)
        {
            System.out.println("They are the same up to three decimal places");//Chúng giống nhau đến ba chữ số thập phân; dảk quá//
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
