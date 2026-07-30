package Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {14,85,56,55,88,89};
        int min = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element is: " + min);

    }
}
