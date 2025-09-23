package Array;

public class WavyArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,10};
        int n = arr.length;
        for(int i=0;i<n-1;i+=2){
//            if(i==n-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
for(int x:arr) System.out.println(x);

    }
}
