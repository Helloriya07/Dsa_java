package Array;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int a = sc.nextInt();

        System.out.println("enter value of array");
        int[] arr = new int[a];
        int sum=0;
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("sum of elements of array"+sum);
    }
}


