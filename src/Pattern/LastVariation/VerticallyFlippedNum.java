package Pattern.LastVariation;

import java.util.Scanner;

public class VerticallyFlippedNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j = 1;j<=n-i;j++) {
                                          //Method 2 ek loop ke ander 2 loop...
                System.out.print(" ");
            }//spaces ke liye

                 for(int k = 1;k<=i;k++){
                     System.out.print(k );
                 }//Numbers ke liye

            System.out.println();
        }

    }
}
