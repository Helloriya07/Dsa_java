package twoDarray;

import java.util.Scanner;
//print 2d array coulumn wise..

public class Columnwise {
    public static void main(String[] args) {
            int[][] arr = new int[2][3];
            Scanner sc = new Scanner(System.in);
            System.out.println("enter values");
            for (int i = 0; i <arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }
            //Columnwise printing.......
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
            }
        //Rowwise printing.......

            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
