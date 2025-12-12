package twoDarray;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 5, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };
        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int[] a:arr){
            for(int elem : a){
                System.out.print(elem);
            }
            System.out.println();
        }
    }
}
