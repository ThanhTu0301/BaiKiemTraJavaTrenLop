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
public class Baitap4 {
    public static void main(String[] args){
        int a;
        int b;
        a=nhapsonguyen("nhập a: ");
        b=nhapsonguyen("nhập b: ");
        giaipt(a,b);
    }
    public static int nhapsonguyen(String str){
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println(str);
        x=sc.nextInt();
        return x;
    }
    public static void giaipt(int a,int b){
        if(a==0)
        {
            if(b==0)
                System.out.println("phương trình vô số nghiệm");
            else
                System.out.println("phương trình vô nghiệm");
        }
        else
            System.out.println("phương trình có nghiệm x= :"+(-b/a));
    }
}
