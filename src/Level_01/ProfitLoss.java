package Level_01;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter cost price ");
        double cp =sc.nextDouble();
        System.out.println("Enter selling price");
        double sp = sc.nextDouble();

        if(sp > cp){
            double profit = sp - cp;
            System.out.println("Profit of " + profit);
        } else if(cp > sp){
            double loss = cp - sp;
            System.out.println("Loss of " + loss);
        } else {
            System.out.println("no profit no loss");
        }
        sc.close();
    }
}
