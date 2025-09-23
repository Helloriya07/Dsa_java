package Array;

public class SortedArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,8,7,10};
        int n = arr.length;
        for(int i=1;i<n;i++) {
            if (arr[i] >= arr[i - 1]){
                System.out.println("sorted");
            }
                else{
                    System.out.println("not sorted");
                }

        }


        }
    }

