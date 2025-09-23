package BasicJava;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 65; i <= 90; i++) {
            char a = (char)i;

            System.out.println(a+" "+i);
        }
    }
}
