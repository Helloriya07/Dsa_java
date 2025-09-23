package Pattern.Triangle;

import java.util.Scanner;

public class HollowRect {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row");
        int row = sc.nextInt();
        System.out.println("enter number of col");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i== 1 || i== row || j==1 || j==col)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }



    }
}
