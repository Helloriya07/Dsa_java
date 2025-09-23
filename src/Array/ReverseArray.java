package Array;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,3,51,66,65,64,63,62,78};
        int n = arr.length;


//         Using Swapping...
        int i=3;
        int j = n-2;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x:arr) {
            System.out.println(x);

        }
//        int[] b= new int[n];
//        for(int i=0;i<n;i++){
//            b[i] = arr[n-1-i];
//        }
//        for(int x:b)
//            System.out.println(x);
    }
}
