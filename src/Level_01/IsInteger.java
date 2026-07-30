package Level_01;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n; //typecasting
        if(n-x > 0){
            System.out.println("Not an integer");
        }else {
            System.out.println("Yes it is integer");
        }

    }
}
