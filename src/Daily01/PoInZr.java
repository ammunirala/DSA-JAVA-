package Daily01;
import java.util.Scanner;

public class PoInZr {
    public static void main(String[] args){
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num + " is Positive");
        } else if (num<0) {
            System.out.println(num + " is Negative ");

        } else {
            System.out.println(num + " is zero ");
        }


    }
}
