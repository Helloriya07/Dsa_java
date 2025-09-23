package BasicJava;
// take a user input tell if its magnitude is smaller
import java.util.Scanner;

public class Greaterorsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        if (Math.abs(n)>69) System.out.println("greter");
        else System.out.println("smaller");
    }

}
