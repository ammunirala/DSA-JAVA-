package Level_01;

public class variables {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is = " + sum);
        //xy
        int prd = x * y;
        System.out.println("multiply of " + x + " and " + y + " is = " + prd);
        // x /y , y /x, x % y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v2);
        //expression
        int exp = (x * y) / ( x + y);
        System.out.println(exp);

    }
}
