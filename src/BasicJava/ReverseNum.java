package BasicJava;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int original = n;
        int rev=0;
        while(n!=0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        int  sum = original+rev;
        System.out.println(rev);
            System.out.println(sum);
        }
}
