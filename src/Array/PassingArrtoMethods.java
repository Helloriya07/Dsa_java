package Array;

import java.util.Scanner;

public class PassingArrtoMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter a number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elem at index 2="+arr[2]);
        change(arr);
        System.out.println("Array elem at index 2="+arr[2]);
        arr[2]=78;

        System.out.println("Array elem at index 2="+arr[2]);
    }
    public static void change(int[]b){
        b[2]=98;
      //  System.out.println("array b ki value="+b[0]);
    }
}
