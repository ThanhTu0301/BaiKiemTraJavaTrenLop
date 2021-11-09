/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luutru;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamCar {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("D:/carfile.txt"));
			Car cars = (Car) ois.readObject();
			System.out.println(cars.toString());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
