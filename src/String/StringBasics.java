package String;

import java.util.Scanner;

public class StringBasics {
    public static void main(String args[]){
     char[] arr ={'p','r','y','a'}; // character array

        Scanner sc = new Scanner(System.in);
        String s = "thisisstring"; // declaration

       // System.out.println(s);
//        String x2 = sc.nextLine();
//        System.out.println(x2);
//        String x = sc.next();
//        System.out.println(x);
        System.out.println(s.indexOf('r'));
        System.out.println(s.lastIndexOf('r'));


    }
}
