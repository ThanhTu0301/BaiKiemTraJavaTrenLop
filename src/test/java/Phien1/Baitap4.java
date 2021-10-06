
import java.util.Scanner;
public class Baitap4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Import the number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; n>0;i++){
            n/=10;
            sum=sum+1;
        }
         System.out.println("the total number of digits in a number is:" + sum);
    }
}
