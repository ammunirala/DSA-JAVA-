package Practice;
//find sum of even numbers
public class p20 {
    public static void main(String[] args) {
        int[] arr = {515,5241,542,785,85};
        double sum = 0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("sum of even numbers = " + sum);
    }
}
