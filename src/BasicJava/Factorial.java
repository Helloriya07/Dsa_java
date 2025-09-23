package BasicJava;

import java.util.Scanner;
//Factorial of a number
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int i = n;
        int fact = 1;
        while (i>0) {
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
    }

}