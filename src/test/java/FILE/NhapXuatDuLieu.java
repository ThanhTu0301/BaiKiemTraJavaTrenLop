/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILE;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author KimAnh
 */
public class NhapXuatDuLieu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String str = scanner.nextLine();
        try {
            
            FileWriter fw = new FileWriter("D:\\test.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ghi thành công");
            FileReader fw = new FileReader("D:\\test.txt");
    int i;
        while ((i = fw.read()) != -1) {
            System.out.print((char) i);
        }
        fw.close();
    
}
}

