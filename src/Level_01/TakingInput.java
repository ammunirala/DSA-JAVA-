package Level_01;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //for integer data type
//        for(int i = 0;i <= n; i ++){
//            System.out.println(i);
//    }
//
//        String name = sc.nextLine(); // for string data type
//        System.out.println("Hello " + name);

        int n = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Dear " + name + " . Here is the counting " );
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }

}
