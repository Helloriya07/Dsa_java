package Pattern.LastVariation;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k <=2*i-1; k++) { // method 1 using math
//                System.out.print("*");
//
//            }
        // method 2 using variables...
        int nsp = n-1; int nst=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <=nst; k++) {
                System.out.print("*");

            }
            nsp--;
            nst+=2;
            System.out.println();
        }


    }
}


