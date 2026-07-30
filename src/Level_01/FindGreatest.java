package Level_01;

import java.util.Scanner;

public class FindGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        System.out.println("enter the value of y");
        int y = sc.nextInt();
        System.out.println("enter the value of z");
        int z = sc.nextInt();
        if(x>=y && x>=z){
            System.out.println("X is greatest number");
        } else if (y>=z && y>=x) {
            System.out.println("Y is greatest");

        }else{
            System.out.println("Z is greatest");
        }

    }
}
