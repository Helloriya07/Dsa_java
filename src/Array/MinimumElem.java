package Array;

public class MinimumElem {
    public static void main(String[] args){
        int[] arr = {-68,-8,-34,-12};
        int min = Integer.MAX_VALUE;
        //int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.print("minimum is"+min);

    }
}


