package Array;

public class TwoSum{
    public static boolean twoSum(int[] arr ,int target){
        for(int i =0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return true;

            }
        }
            return false;
    }
    public static void main(String[] args){
//        int[] arr = {12,6,9,4,5};
//        int target =11;
//       boolean result= twoSum(arr,target);
//       System.out.println("two sum exist or not="+result);
        System.out.println("two sum");
    }
}