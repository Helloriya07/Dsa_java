package Array;

public class MultipyOddEvenIndex {
    public static void main(String[]args){
        int[] arr = {1,4,5,7,9,12};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
               System.out.println("even index"+arr[i]*10);
            }
            else System.out.println("odd index"+arr[i]*2);
        }
    }
}
