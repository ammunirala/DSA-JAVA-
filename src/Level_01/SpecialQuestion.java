package Level_01;

import java.util.Scanner;

public class SpecialQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("shyam");
        } else if (n % 3 == 0) {
            System.out.println("Shudhanshu");

        } else if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Akash");

        } else  {
            System.out.println("Nikhil");

        }
    }
}
