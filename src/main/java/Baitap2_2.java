
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
public class Baitap2_2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String Alphabet = sc.next().toLowerCase();

        boolean uppercase = Alphabet.charAt(0) >= 65 && Alphabet.charAt(0) <= 90;
        boolean lowercase = Alphabet.charAt(0) >= 97 && Alphabet.charAt(0) <= 122;
        boolean vowels = Alphabet.equals("a") || Alphabet.equals("e") || Alphabet.equals("i")
                || Alphabet.equals("o") || Alphabet.equals("u");

        if (Alphabet.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}

