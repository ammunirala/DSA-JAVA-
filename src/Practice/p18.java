package Practice;
//count even numbers
public class p18 {
    public static void main(String[] args){
        int[] arr = {10,15,42,86,69,47};
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }

        }
        System.out.println("Even numbers = " + count);
    }
}
