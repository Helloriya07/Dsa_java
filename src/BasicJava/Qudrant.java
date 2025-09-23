package BasicJava;

import java.util.Scanner;
// Quadrant pata karne k liye....
public class Qudrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth quadrant");
        } else {
            System.out.println("kuch nhi");
        }
    }
}
