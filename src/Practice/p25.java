package Practice;
// find average

public class p25 {
    public static void main(String[] args) {
        int[] arr = {10,55,55,85,85,56,55};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum +arr[i];


        }
        double average = (double) sum / arr.length;
        System.out.println("Average = " + average);

    }
}
