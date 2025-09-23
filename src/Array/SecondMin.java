package Array;

public class SecondMin {
    public static void main(String[] args){
        int[]a={1,8,7,5,3,3};
        int min = a[0];
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                smin= min;
                min = a[i];
            }
        else if(a[i]>min && a[i]<smin)
            smin= a[i];
        }
      System.out.println("Second minimum="+smin);
    }
}
