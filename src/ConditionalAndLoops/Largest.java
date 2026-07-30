package ConditionalAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter  value of n1: ");
//        int n1 = sc.nextInt();
//        System.out.println("Enter value of n2: ");
//        int n2 = sc.nextInt();
//        System.out.println("Enter value of n3: ");
//        int n3 = sc.nextInt();
//
//        if(n1>n2 && n1>n2){
//            System.out.println("n1 is largest");
//        } else if (n2>n1 && n2>n3) {
//            System.out.println("n2 is largest");
//
//        } else {
//            System.out.println("n3 is largest");
//        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Q: find largest of the 3 numbers using only if

        int max = a; // assume
        if(b > max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("largest number is:" + max);



    }
}
