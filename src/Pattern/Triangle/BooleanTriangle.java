package Pattern.Triangle;

import java.util.Scanner;

public class BooleanTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if((i+j)%2==0) System.out.print("1 "); //i+j =odd to 0 print hoga
               else System.out.print("0 ");
            }
            System.out.println();


            }
        }
}
