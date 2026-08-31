package BasicLoopsAndConditions;
import java.util.Scanner;

public class PrintEvenNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
    }
}
