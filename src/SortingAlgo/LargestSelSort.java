package SortingAlgo;
//Find the largest first order using selection sort
public class LargestSelSort {
    public static void main(String[] args){

        int[] arr = {2,9,6,4,7,5,6,3};

        int n = arr.length;
        for(int i =0; i< n-1 ; i++){
            int max = Integer.MIN_VALUE;
            int maxidx = -1;
            for(int j = i; j<n ; j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxidx = j;
                }

            }
            // Now swap
            int temp = arr[i];
            arr[i]= arr[maxidx];
            arr[maxidx] = temp;
        }
        for(int val :arr) System.out.print(val+" "); {

        }
    }
}
