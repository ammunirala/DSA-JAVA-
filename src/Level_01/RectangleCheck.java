package Level_01;

import java.util.Scanner;

public class RectangleCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int area = l * b;
        int perimeter = 2 * (l + b);

        if (area > perimeter) {
            System.out.println("Area is greater than Perimeter");
        } else {
            System.out.println("Area is NOT greater than Perimeter");
        }

        sc.close();
    }
}
