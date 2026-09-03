package Practice;
//print elements at odd index
public class p15 {
    public static void main(String[] args){
        int [] arr = {10,5,28,75,65,48};
        for (int i = 0; i < arr.length ; i++) {
            if(i % 2 != 0){
                System.out.println(arr[i] + "  ");
            }

        }
    }
}
