package Array;

public class Replace0s {
    public static void main(String[] args) {
        int num = 05;
        int placevalue = 1;
        int result = 0;
        while (num > 0) {

            int digit = num % 10;
            if(digit==0) digit=5;
            result = result+digit*placevalue;
            placevalue*=10;
            num/=10;


        }
        System.out.print(result);
    }
}
