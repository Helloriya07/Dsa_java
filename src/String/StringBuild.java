package String;

import java.sql.SQLOutput;

public class StringBuild {


    public static void main(String[] args) {

         String s1 = "nisha";
         String s2= "nisha";
         String s3="riya";
        System.out.println(s1==s2);

        System.out.println(s1==s3);

        String s = new String("ooo");
        String t = new String ("ooo");
        String w = new String ("oyy");
        System.out.println(s==t);
        System.out.println(s==w);
        System.out.println(s.equals(t));
        System.out.println(s.equals(w));

//        StringBuilder sb = new StringBuilder(6);
//        System.out.println(sb.capacity());
//        System.out.println(sb.append("raghav"));
//        System.out.println(sb.capacity());
//        sb.setCharAt(1,'y');
//        System.out.println(sb);
//        //sb to string
//        String v = sb.toString();
//        System.out.println(v.length());
//





    }
}
