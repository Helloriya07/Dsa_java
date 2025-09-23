package Methods;

import java.util.Scanner;

public class MaxThreeBuiltin {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d= sc.nextInt();

       System.out.println((Math.max(Math.max(Math.max(a,b),c),d)));
        //  System.out.println(Math.min(Math.min(a,b),c));

    }
}
