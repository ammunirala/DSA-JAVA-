package Practice;
// Diffrence between maximum  and minimum

public class p24 {
    public static void main(String[] args) {
        int[] arr = {10,52,65,785,48,4587,650};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
                if(arr[i]> max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }

            }
            int difference = max - min;
            System.out.println("Difference = " + difference);
        }
    }


