package Practice;
// search an element

public class p26 {
    public static void main(String[] args) {
        int[] arr = {10,25,75,5584,45,45};
        int target = 5584;
        boolean found = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target){
                found = true;
                break;
            }
            
        }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
        
    }
}
