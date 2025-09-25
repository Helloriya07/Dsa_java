package SortingAlgo;

// Find the kth smallest element in an array.
public class KthSmallest {
    public static void main(String[] args){
        int[] arr ={ 4 ,7,9,3,2};
        int k =4;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        System.out.println(arr[k-1]);


    }
}
