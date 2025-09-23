package BasicJava;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        int i =99;
        while(i>=103-4*n){

            System.out.println(i);
            i-=4;
        }
    }
}
