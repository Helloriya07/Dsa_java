package Array;

public class MissingInArray {
    public static void main(String[] args){
        int[] arr={5,4,3,1};
        long n= arr.length +1; // here we have taken long bcoz
                               // max size of array can be 10^6  which cannot be stored in int.
        long sum = n*(n+1)/2;
        long Arrsum=0;
        for(int i:arr){
            Arrsum+=i;
        }
        int missing = (int)(sum-Arrsum); // long-long cannot be stored in int that
                                         // is why type conversion
        System.out.println(missing);
    }
}
