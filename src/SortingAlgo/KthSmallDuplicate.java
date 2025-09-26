package SortingAlgo;

import java.util.ArrayList;

// Find the kth smallest element in an array containing duplicate elements
public class KthSmallDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 7, 7, 5, 2, 9, 3, 2};
        int k = 4;
        for(int i=1;i< arr.length;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){ //sort the elements
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        //Remove Duplicate elements from array and assign into unique list.
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(arr[0]);
        for(int elem=1;elem< arr.length;elem++){
            if(arr[elem]!=arr[elem-1]){
                unique.add(arr[elem]);
            }
        }
        //Now Print the elements.
        if(k<=unique.size()) System.out.println(unique.get(k-1));

    }

}
