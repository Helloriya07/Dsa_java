package BasicJava;

import java.util.Scanner;
// a raised to power b......
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
             power =power*a;

        }
        System.out.println(power);
    }
}
