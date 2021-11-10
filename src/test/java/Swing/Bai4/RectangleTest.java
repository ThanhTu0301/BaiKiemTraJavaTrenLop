/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author KimAnh
 */
public class RectangleTest {
    public static void main(String[] args) {
    Rectangle hcnhat = new Rectangle (3, 15, 8, 5);
        System.out.println("Chu vi hình chữ nhật là = " + hcnhat.calcPerimeters());
        System.out.println("Diện tích hình chữ nhật là = " + hcnhat.calcArea());
    } 
}
