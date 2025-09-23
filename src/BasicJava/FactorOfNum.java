package BasicJava;
//Wap to print factors of a number..
import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                System.out.println(i);

        }
    }
}