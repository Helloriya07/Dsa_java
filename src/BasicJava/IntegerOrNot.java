package BasicJava;
//Integer or not
import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double n =sc.nextDouble(); // 7.5
        int x = (int)n; // x=7
        if(n== (int)n) System.out.println("not a integer"); // 7.5-7=0.5>0
        else System.out.println("integer");


    }
}
