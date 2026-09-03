package Java;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();
        //Encryption
        int encryptedGrade = grade + 8;
        System.out.println("Encrypted Grade: " + encryptedGrade);
        //Decryption
        int decryptedGrade = encryptedGrade - 8;
        System.out.println("Correct Grade: " + decryptedGrade);

    }
}
