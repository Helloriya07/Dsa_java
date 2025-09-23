package Array;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int a = sc.nextInt();
        System.out.println("enter value of array");
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]<0)
            System.out.println(arr[i]);
        }
    }
}
