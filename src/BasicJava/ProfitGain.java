package BasicJava;

import java.util.Scanner;

public class ProfitGain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost and sell prize");
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
      double  profit = sp - cp;
        double  loss= cp - sp;
        if (sp>cp) System.out.println("profit has ocuured"+profit);
        if(cp>sp) System.out.println("loss"+loss);
        if(cp==sp) System.out.println("no loss no gain");

    }
}
