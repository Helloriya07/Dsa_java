package SortingAlgo;

public class mountainArray {
    //peak element in mountain array.....
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,5,6,8,6,3};
        int l=1;
        int h =arr.length-2;
        int peak = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                peak = mid;
                h=mid-1;
            }
            else if (arr[mid]>arr[mid-1]) l=mid+1; //increasing slope
            else h=mid-1;// decreasing slope

            }
        System.out.print("index="+peak+"  "+"elem="+arr[peak]);

        }
    }

