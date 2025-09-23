package SortingAlgo;

// sort the array in descending order using bubble sort.
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {8,5,3,4,1,9};
        int n = arr.length;
        for(int i =0;i<=n-1;i++){
            int swaps =0;
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }

            if(swaps==0) break;

        }
        for(int x:arr) System.out.print(x+"  ");

    }
}
