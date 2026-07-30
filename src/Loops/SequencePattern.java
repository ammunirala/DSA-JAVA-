package Loops;

import java.util.Scanner;

public class SequencePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n/2; i++) {
            System.out.println(i);
            System.out.println(n - i + 1);
        }

        // middle element (when n is odd)
        if (n % 2 != 0) {
            System.out.println(n/2 + 1);
        }

        sc.close();
    }
}

