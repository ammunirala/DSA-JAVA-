package Practice;

import java.util.Scanner;

public class GreaterOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        if(x>y){
            System.out.println("x is greater number");
        } else {
            System.out.println("y is greater number");
        }
    }

}
