package SortingAlgo;

public class BSDesc {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4};
        int target = 5;
        int l = 0;
        int h = arr.length - 1;
        int idx = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == target) {
                idx = mid;
                h=mid-1;
            }
            else if (arr[mid] > target) l = mid + 1;
            else h = mid - 1;
        }

            System.out.println(idx);

    }
}
