package Loops;

import java.util.Scanner;

public class ApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a=2, d= 3;
        // 2,5,11,14...
//        for(int i = 2; i<=3*n-1; i+=3){
//            System.out.println(i+" ");
//        }

        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            a +=d;
        }

        }
    }

