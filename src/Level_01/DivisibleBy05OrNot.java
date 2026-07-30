package Level_01;

import java.util.Scanner;

public class DivisibleBy05OrNot {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer number");
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        if(x%5==0){
            System.out.println("yes it is divisible by 5");
        } else {
            System.out.println("no it is not divisible by 5");
        }

    }
}
