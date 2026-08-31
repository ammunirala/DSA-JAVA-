package BasicLoopsAndConditions;
import java.util.Scanner;


public class Print1_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        //logic
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");

        }
    }
}
