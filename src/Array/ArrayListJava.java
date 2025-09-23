package Array;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(); //Declaration
        arr.add(23);
        arr.add(13);
        arr.add(53);
        arr.add(93);
        System.out.println(arr.get(3));
        arr.set(2,0);
        int n = arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        for(int x:arr){
            System.out.print(x);
        }

    }
}
