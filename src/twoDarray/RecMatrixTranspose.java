package twoDarray;

public class RecMatrixTranspose {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{3,6,7,8,9}};
        transpose(arr);


    }
        public static int[][] transpose(int[][] arr) {

            int m = arr.length; // length of row
            int n = arr[0].length; // length of column
            int[][] mat = new int[n][m];
            for(int i =0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    mat[i][j] = arr[j][i];
                }
            }
            for(int[] a :mat){
                for(int elem: a){
                    System.out.print(elem+" ");
                }
                System.out.println();
            }
            return mat;
        }
    }

