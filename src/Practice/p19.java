package Practice;
//count odd numbers
public class p19 {
    public static void main(String[] args){
        int[] arr = {10,885,25,8,78,94,57,53};
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 != 0){
                count++;
            }

        }
        System.out.println("odd numbers = " + count);
    }

}
