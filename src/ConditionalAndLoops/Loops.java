package ConditionalAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 1 to 5
//        for(int num = 1; num<=5; num++){ // for loop
//            System.out.println(num);
//        }
        // print numbers from 1 to n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n = sc.nextInt();
//        for(int num = 1; num<=n; num++){
//            System.out.println("Namaste");
//            System.out.println(num);
//        }

        // print numbers from 1 to 5
//        for(int num = 1; num<=5; num++){ // for loop(when you know how many times run the loop use for loops)
//            System.out.println(num);
//        }

        // while loop (when you don't know how many times run the loop use while loop)
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num++;
//        }

        //do while (syntax) -> (execute  at least once after that check condition)
        /*
        do{

        } while (condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
