package ConditionalAndLoops;

import java.util.Scanner;
//reverse number
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;            // reversed number

        while (num > 0) {
            int rem = num % 10;   // last digit nikala
            rev = rev * 10 + rem; // reverse me add
            num = num / 10;           // last digit hata diya
        }

        System.out.println(rev);

    }
}

