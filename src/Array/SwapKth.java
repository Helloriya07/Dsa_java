package Array;

public class SwapKth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int k = 3;
        int firstelem = k - 1;
        int secondelem = n - k;
        //Swap
        int temp = arr[firstelem];
        arr[firstelem] = arr[secondelem];
        arr[secondelem] = temp;
        for (int x : arr)
            System.out.println(x);

    }
}