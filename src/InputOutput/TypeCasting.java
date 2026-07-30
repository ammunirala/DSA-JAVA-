package InputOutput;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //type casting
//        int num = (int)(65.54f);
//        System.out.println(num);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.65f;
        double d = 0.26;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);



    }
}
