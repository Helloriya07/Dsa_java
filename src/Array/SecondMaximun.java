package Array;

import java.util.Arrays;
public class SecondMaximun {
    public static void main(String[] args){
        int arr[] = {1,5,9,2,8,5};
        int max= arr[0];
        int smax = Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
        int n = arr.length;
        //Optimised Solution... o(n)

        for(int i=0;i<n;i++) {
            if (arr[i] > max) {
                max = smax;
                max = arr[i];
            }

        else if (arr[i] < max && arr[i]>smax)
            smax=arr[i];
        }
        System.out.println("Second maximum="+smax);






        //Brute Force Solution (complexity == nlogn)
//        Arrays.sort(arr);
//        for(int i =0;i<n;i++){
//             max=arr[n-2];
//             min=arr[n-5];
//        }
//        System.out.print("second maximum and second minmum="+max+""+min);

        //Better solution.. (complexity=o(2n)
        //First pass........
//        for(int i=0;i<n;i++){
//            if(arr[i]>max)
//                max=arr[i];
//        }
        // Second pass......
//        for(int i=0;i<n;i++){
//            if(arr[i]>smax && arr[i]!=max)
//                smax=arr[i];
//        }
//        System.out.println("Second maximum="+smax);



        
    }
}
