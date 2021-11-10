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
public class CircleTest {
    public static void main(String[] args){
        Circle htron = new Circle(5, 1, 2);
        System.out.println("Chu vi hình tròn là = " + htron.calcPerimeter());
        System.out.println("Diện tích hình tròn là = " + htron.calcArea());
    }
}
