package twoDarray;

public class RotateAntiClock {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for(int i=1;i<arr.length;i++){
            for(int j =0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }
        }
// rotate anticlockwise == coloumwise
        for(int i=0;i<arr[0].length;i++){
            int stcol =0; int encol = arr[0].length -1;
            while(stcol<encol){
                int temp = arr[stcol][i];
                arr[stcol][i] = arr[encol][i];
                arr[encol][i]= temp;
                stcol++;
                encol--;
            }
        }
        for(int[] a :arr){
            for(int elem:a){
                System.out.print(elem);
            }
            System.out.println();
        }



    }
}
