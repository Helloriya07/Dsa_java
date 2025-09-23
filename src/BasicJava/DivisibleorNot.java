//check whether number is divisble by 5 or not
package BasicJava;
import java.util.Scanner;
public class DivisibleorNot {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number");
    int a = sc.nextInt();
    if(a%5==0) {
        System.out.println("Number is divisible by 5");
    }
        else{
            System.out.println("Number is not divisible by 5");
        }
    }

    }

