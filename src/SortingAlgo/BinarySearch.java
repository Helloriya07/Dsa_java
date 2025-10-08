package SortingAlgo;

import java.util.ArrayList;
// Binary search in duplicate elements of array return first and last occurances.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,6,6,7};
        int key =9;
        int first=search(arr,key);
        int second=search2(arr,key);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(second);
        for(int i =0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }


    }
    public static int search(int[]arr,int key){
        int l=0;
        int h = arr.length-1;
       int idx=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==key){
                idx = mid;
                h=mid-1;
            }
            // agar middle elem key se bada hai to hum left me jayege
            else if(arr[mid]>key) h=mid-1;
            else l = mid+1; // agar middle elem key se chota hai right me jayege
        }
        return idx;
    }
    public static int search2(int[]arr,int key){
        int l=0;
        int h = arr.length-1;
        int idx=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==key){
                idx = mid;
                l=mid+1;
            }
            // agar middle elem key se bada hai to hum left me jayege
            else if(arr[mid]>key) h=mid-1;
            else l = mid+1;
        }
        return idx;
    }
}


