package BasicJava;

import java.util.Scanner;
//print sum of digits of a number...
public class SumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int temp = n%10;
            sum = sum + temp;
            n/=10;
        }
        System.out.println(sum);
    }
}
