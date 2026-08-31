package Lecture_10;

public class conditionals {
   public static void main(String[] args){
       //*********if conditions***********
//        int age = 20;
//        if (age>=18){
//            System.out.println("eligible to vote");
//
          //*********if-else condition************
//    int age = 12;
//    if(age>18){
//        System.out.println("you can vote ");
//
//
//    } else {
//        System.out.println("you cannot vote");
//    }

       //******if else if ladder**********
//       int accuracy= 78;
//       if (accuracy>=90){
//           System.out.println("Excellent");
//       } else if (accuracy >=75) {
//           System.out.println("Good");
//
//       } else if (accuracy >= 60) {
//           System.out.println("Avarage");
//
//       } else {
//           System.out.println("Needs Improvements");
//       }

       //**********Nested If-Else************

//       boolean hasSubscription = true;
//       int solvedProblems = 220;
//       if (hasSubscription){
//           if(solvedProblems>=220){
//               System.out.println("Unlock Advanced Sheet");
//           } else {
//               System.out.println("practice more problems");
//           }
//       } else {
//           System.out.println("Upgrade to Premium");
//       }

       //one more examples of nested if else
       //question:check your age and driving license
//       int age= 20;
//       boolean license = true;
//       if(age>=18){
//           if(license){
//               System.out.println("You can drive");
//           }else {
//               System.out.println("you are not eligible to drive");
//           }
//       }
       //-**********Ternary operator*********
//       int streakDays = 35;
//       String status = (streakDays >= 30) ? "consistent": "Irregular";
//       System.out.println(status);
//

//       int num = 10;
//       String result = (num%2==0)?"Even":"Odd";
//       System.out.println(result);
//       int  age = 20;
//       String result = (age >=18)?"Adult":"Minor";
//       System.out.println(result);

       //********SWITCH STATEMENT**************
//       int day = 2;
//       switch (day){
//           case 1:
//               System.out.println("monday");
//               break;
//
//           case 2:
//               System.out.println("tuesday");
//               break;
//           case 3:
//           System.out.println("wednesday");
//           break;
//           case 4:
//               System.out.println("thursday");
//               break;
//           default:
//               System.out.println("Invalid day");
//
//
//       }

//       int a = 10;
//       int b = 5;
//       char operator = '+';
//       switch (operator){
//           case '+':
//               System.out.println(a + b);
//               break;
//           case '-':
//               System.out.println(a-b);
//               break;
//           case '*':
//               System.out.println(a*b);
//               break;
//           case '/':
//               System.out.println(a/b);
//               break;
//           default:
//               System.out.println("Invalid operator");
//       }

//       int choice =2;
//       switch (choice){
//           case 1:
//               System.out.println("pizza");
//               break;
//               case 2:
//               System.out.println("Burger");
//               break;
//           case 3:
//               System.out.println("Pasta");
//               break;
//           default:
//               System.out.println("Invalid choice");
//
//
//       }
       // you can also use multiple cases for the same output

//       int day = 6;
//       switch (day){
//           case 1:
//           case 2:
//           case 3:
//           case 4:
//           case 5:
//               System.out.println("weekday");
//               break;
//           case 6:
//           case 7:
//               System.out.println("weekend");
//               break;
//           default:
//               System.out.println("invalid day");
//       }

       int num = 1;
       switch (num){
           case 1:
               System.out.println("one");
           case 2:
               System.out.println("Two");
           case 3:
               System.out.println("Three");
       }
 }

}
