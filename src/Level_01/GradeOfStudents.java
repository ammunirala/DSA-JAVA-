package Level_01;

import java.util.Scanner;

public class GradeOfStudents {
    public static void main(String[] args) {
        System.out.println("Enter the marks of Students: ");
//     int marks = 70;
//     if(marks >= 90){
//         System.out.println("Grade : A");
//
//     } else if (marks >=80) {
//         System.out.println("Grade : B");
//
//     } else if (marks >=70) {
//         System.out.println("Grade: C");
//
//     } else if (marks >= 60) {
//         System.out.println("Grade: D");
//
//     }else {
//         System.out.println("Grade: F");
//     }
//

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>=90){
            System.out.println("Excellent");
        } else if (marks >=80){
            System.out.println("Good");
        } else if (marks >=70){
            System.out.println("fair");
        } else if (marks >=60){
            System.out.println("Meet Expectation");
        }else {
            System.out.println("Very bad baccha");
        }
     }
}
