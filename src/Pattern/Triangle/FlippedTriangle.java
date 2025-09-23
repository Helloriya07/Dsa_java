package Pattern.Triangle;

import java.util.Scanner;
//In FlippedTriangle value of i+j=n+1 so j = n+1-i
public class FlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
