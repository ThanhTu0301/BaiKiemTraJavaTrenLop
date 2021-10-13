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
public class Baitap3 {
    public static void test()   
{  
    System.out.println("hello");          
}  
public static void repeat(int n){
    for(int i=0;i<n;i++){
        test();
    }

}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        repeat(num);
                
    }
}
