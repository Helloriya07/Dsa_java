package Array;

public class MaximumElem {
    public static void main(String[] args){
        int[] arr = {-97,-98,-34,-12,-7};
        int max=Integer.MIN_VALUE;
        //int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.print("maximum is"+max);

    }
}
