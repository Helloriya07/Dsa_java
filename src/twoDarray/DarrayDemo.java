package twoDarray;

import java.util.Scanner;
// maximim sum and return row having max sum
public class DarrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        for(int i=0;i<arr.length;i++){
            for(int j =0;j< arr.length;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        int maxSum =Integer.MIN_VALUE;
        int row =-1;

        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length;j++){
                sum+= arr[i][j];

            }
            if(sum>maxSum){
                maxSum=sum;
                row = i;
            }
        }
        System.out.println(row+" "+maxSum);


    }
}
