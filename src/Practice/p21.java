package Practice;
//find maximum elements
public class p21 {
    public static void main(String[] args) {
        int[] arr = {10,55,45,87,72,15};
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
}
