/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hàm;

import java.util.Scanner;

/**
 *
 * @author KimAnh
 */
public class Baitap2 {
    public static void test()   
    {  
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();              
        System.out.print("You have entered: "+str);             
    }  


    public static void main(String[] args) {
        
        test();
    }
}
