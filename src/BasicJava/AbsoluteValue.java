package BasicJava;

import java.util.Scanner;
//absolute value of integer;
public class AbsoluteValue {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
        if(n<0)n=-n;
        System.out.println(n);
    }

}

