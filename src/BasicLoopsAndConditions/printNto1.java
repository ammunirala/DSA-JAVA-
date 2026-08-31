package BasicLoopsAndConditions;
import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        for (int i = n; i>=1; i--){
            System.out.println(i + " ");
        }
    }

}
