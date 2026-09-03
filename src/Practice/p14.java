package Practice;
// print Elements at Even Index
public class p14 {
    public static void main(String[] args){
        int[] arr = {10,25,25,56,51,75,98};
       for (int i = 0; i < arr.length; i++){
           if(i % 2 == 0){
               System.out.println(arr[i] + " ");
           }
       }
    }
}
