package BasicJava;
//take b input and print sequence of numbers 1 n 2 n-1 3 n-2
import java.util.Scanner;

public class SequenceOfNumNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        for (int i =1,j=n; i<=j; i++,j--) {
            if (i==j){
                System.out.println(i);
            }
            else {
                System.out.println(i+""+j+"");
            }
        }

    }
}

