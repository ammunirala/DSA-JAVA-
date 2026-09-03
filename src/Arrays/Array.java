package Arrays;


import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //declaration
        //int arr[];
        //allocation
        //arr = new int[5];
        //initialize
        //int brr[] = {10,20,30};
        //access
//        System.out.println("value at 1 index is: " + brr[1]);
//        System.out.println("value at 0 index is: " + brr[0]);
//        System.out.println("value at 2 index is: " + brr[2]);

        //int n = brr.length;
        //for each loop
        //for (int val:brr){
          //  System.out.println(val);
        //}
        //classical for loop
//        for (int index = 0; index <=n-1 ; index++) {
//            System.out.println(brr[index]);
//
//        }

        //************* taking input in an array************************
//        int  arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i =0; i<=n-1; i++){
//            System.out.println("Provide input for index: " +i);
//            arr[i] = sc.nextInt();
//        }
//        //print
//        System.out.println("Your array contains: ");
//        for (int val: arr){
//            System.out.println(val);
//        }

        //*********************sum of given array*****************
//        int arr[] = {10,20,30,10,15,6};
//        int sum = 0;
//        int n = arr.length;
//        for (int i = 0; i <=n-1; i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        // sum is ready to print
//        System.out.println(sum);

        //************multiplay of given array and print**************
//        int arr[]= {5,5,8,4,10};
//        int mul = 1;
//        int n = arr.length;
//        for(int i = 0; i<=n-1; i++){
//            int value = arr[i];
//            mul = mul* value;
//        }
//        System.out.println(mul);

        //***********find the maximum element inside the array**************
//        int arr[] = {3,2,58,47,-25,99};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        // compare maxValue ko array ke har element ke sath
//        for(int i = 0; i <=n-1; i++){
//            if(arr[i] > maxValue){
//                //update maxValue
//                maxValue = arr[i];
//
//            }
//        }
//        System.out.println(maxValue);

        int arr[] = {3,2,58,47,-25,99};
        int n = arr.length;
        int minValue = arr[0];

        // compare maxValue ko array ke har element ke sath
        for(int i = 0; i <=n-1; i++){
            if(arr[i] < minValue){
                //update maxValue
                minValue = arr[i];

            }
        }
        System.out.println(minValue);














          }

}
