
import java.util.Scanner;
public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import the number: ");
        int a = sc.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of the numbers from 1 to a given number is:" + sum);
    }
}
