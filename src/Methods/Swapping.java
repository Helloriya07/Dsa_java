package Methods;

public class Swapping {
    public static void swap(int a[]) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

    public static void main(String[] args) {
        int[]x={1,2};
            System.out.println("before swapping"+x[0]+""+x[1]);

        swap(x);
            System.out.println("After swapping"+x[0]+""+x[1]);



    }
}
