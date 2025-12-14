package twoDarray;

public class RotateBy90degClock {
    public static void main(String[] args) {
        int[][] arr ={
                {2,8,3,4},
                {7,2,1,6},
                {5,5,4,1},
                {3,1,8,2}
        };
        // transpose
        for(int i=1;i<arr.length;i++){
            for(int j =0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }
        }

        for(int i=0;i<arr[0].length;i++){
            int stcol =0; int encol = arr[0].length -1;
            while(stcol<encol){
                int temp = arr[i][stcol];
                arr[i][stcol] = arr[i][encol];
                arr[i][encol] = temp;
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
