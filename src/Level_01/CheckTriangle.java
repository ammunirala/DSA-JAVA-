package Level_01;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first side: ");
        int a =sc.nextInt();
        System.out.println("Enter a second side:");
        int b = sc.nextInt();
        System.out.println("Enter a third side:");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("tringle possible");
        } else {
            System.out.println("not possible");
        }
    }
}
