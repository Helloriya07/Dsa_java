package Array;

public class ArraySearch {
    public static void main(String[] args){
        int []arr={9,5,7,3,5,266};
        int a=9;
        boolean flag = false;
        for (int i : arr) {
            if (i == a) {
                flag = true;
                break;
            }
        }
          if(flag)  System.out.println("number exist");
          else System.out.println("does not exist");
        }

    }
//
//class Solution {
//    public int search(int arr[], int x) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                return i; // Index return karo
//            }
//        }
//        return -1; // Not found
//    }
//}


