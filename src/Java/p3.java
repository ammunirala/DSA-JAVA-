package Java;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int givenNumber = 50;
        System.out.println("Enter a number: ");

        int userNumber = sc.nextInt();

        if(givenNumber > userNumber){
            System.out.println("Given number is greater.");
        } else {
            System.out.println("Given number is not greater.");
        }


    }
}
