
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
public class BaiTapSlide24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tu nhien a: ");
        int a=sc.nextInt();
        System.out.println("Nhap so tu nhien b: ");
        int b=sc.nextInt();
        if (a >= b) {
          System.out.println("Dap an cua phep toan a - b la gi: ");
          int c=sc.nextInt();
          if (c == a-b) {
             System.out.println(" Dung "); 
          }
          else {
              System.out.println(" Sai ");
          }
        }
        else {
            System.out.println("Khong thuc hien phep tinh duoc vi a < b ");
        }
    }
}
