package Array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 7, 8, 0, 3};
        int n = arr.length;
        int j=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x:arr)
        System.out.println(x);
    }
}


