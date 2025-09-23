package Pattern.Triangle;

import java.util.Scanner;

public class TriangleOddNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        int count =1;
        for(int i=1;i<=a;i++){
            for( int j=1;j<=i;j++){
              //  System.out.print(2*j-1);
                System.out.print(count);
                count+=2;


            }
            System.out.println();
            count =1;
        }

    }
}
