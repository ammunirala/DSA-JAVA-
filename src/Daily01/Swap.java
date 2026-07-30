package Daily01;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;

        //addition and substraction rule

//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        //divide and multiplication method

//        int a = 10, b = 20;
//
//        a = a * b;
//        b = a / b;
//        a = a / b;



        //xor bitwise method

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
