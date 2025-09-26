package SortingAlgo;

//Insertion Sort Algorithm....
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, 8, 6, 4, 2};
         for(int i=1;i< arr.length;i++) {
             int j = i;
             while (j > 0 && arr[j]<arr[j - 1]) {
                 int temp = arr[j];
                 arr[j] = arr[j - 1];
                 arr[j - 1] = temp;
                 j--;
             }
         }
        for(int elem: arr) System.out.print(elem+" ");
    }
}

