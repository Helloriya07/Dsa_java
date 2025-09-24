package SortingAlgo;

import java.util.ArrayList;

// find two elements in an array whose sum is equal to target element.
public class PairSUm {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> result = twoSum(arr, target);
        System.out.println(result);

    }

    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            result.add(-1);
            result.add(-1);
        }


        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                result.add(i);
                result.add(j);
                return result;

            } else if (sum > target) j--;
            else i++;
        }

        result.add(-1);
        result.add(-1);
        return result;


    }
}





