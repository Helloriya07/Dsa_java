package Array;

public class CountEvenOdd {
    public static void main(String[] args){
        int[] arr={2,5,6,8,7,3};
        int n = arr.length;
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) countEven++;
            else countOdd++;
        }
        System.out.println((countOdd+""+countEven));
    }
}
