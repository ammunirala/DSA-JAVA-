package Practice;
//find minimum element
public class p22 {
    public static void main(String[] args) {
        int[] arr = {1,5,48,88,75,55,10};
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Minimum = " + min);


    }
}
