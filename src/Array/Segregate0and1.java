package Array;

public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 0){ i++;}
             else if(arr[j] == 1) {j--;}
           else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
            for (int x : arr) System.out.print(x);

//        int numbersOfZeros=0;
//        int numberofOnes=0;
//            for(int x:arr){
//                if(x==0) numbersOfZeros++;
//                else numberofOnes++;
//            }
//            for(int i=0;i<numbersOfZeros;i++){
//                arr[i]=0;
//            }
//            for(int i=numbersOfZeros;i<arr.length;i++){
//                arr[i]=1;
//            }
//            for(int x:arr){
//                System.out.print(x);
//            }
        }

    }




