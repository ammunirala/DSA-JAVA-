package Level_01;

import java.util.Scanner;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x =sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        if(x == 0 && y == 0){
            System.out.println("at the origin");
        } else if (x == 0) {
            System.out.println("X-axis");

        } else if (y == 0) {
            System.out.println("Y-axis");

        } else if (x>0 && y>0) {
            System.out.println("1st Quadrants");

        } else if (x<0 && y >0) {
            System.out.println("2nd Quadrants");

        }else if (x<0 && y<0){
            System.out.println("Third Quadrants");


        } else {
            System.out.println("4rth Quadrants");
        }
        sc.close();
    }
}
