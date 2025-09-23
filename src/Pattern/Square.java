package Pattern;
//Rectangles---
//for(i=1 to n)
//    for(j=1 to n)
//        print()
//nextline
//
//Square---
//for(i=1 to n)
//    for(j=1 to n)

import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                int ch=j+96; //j+64
//                System.out.print((char)ch +" ");
//            }
//
//            System.out.println();

//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i);
//            }
//            System.out.println();

//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for(int i =1;i<=n;i++) {
//            for (int j = 1; j <= n; j++) {
//                int ch = i + 64;
//
//                System.out.print((char) ch + "");
//            }
//            System.out.println();
//        }


//        for(int i =1;i<=n;i++) {
//           for (int j = 1; j <= n; j++) {
//                int ch = j+ 96;
//
//                System.out.print((char) ch + "");
//            }
//            System.out.println();
//        }

//H.w. aaaa
//        BBBB
//         cccc
//         DDDD

        for(int i =1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if(i%2!=0) System.out.print((char)(i+96));
                else System.out.print((char)(i+64));
            }
            System.out.println();
        }





    }
}
