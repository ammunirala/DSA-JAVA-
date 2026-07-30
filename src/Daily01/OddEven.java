package Daily01;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
//        int a = 9;
//        if (a%2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num +  " is Even number ");
        } else {
            System.out.println(num + " is odd number ");
        }


    }
}
