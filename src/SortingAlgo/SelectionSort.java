package SortingAlgo;



public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {5,9,4,8,9,7};



        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minidx =-1;
            for(int j =i; j<n ;j++){ // pure array me har pass me
                //minimum element find karke
                //index assign karna.
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j;

                }
            }
            int temp = arr[i];
            arr[i]= arr[minidx]; // then swap that index with ith index..
            arr[minidx] = temp;
        }
        for(int x:arr) System.out.print(x+"  ");

    }
}


