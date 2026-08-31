package PatternPrinting;

public class InvertedRightAngleTriangle {
   public static void main(String[] args){
//       int n = 5;
//       for (int i = n; i >=1; i--) {
//           for (int j = 1; j <= i; j++) {
//               System.out.print("* ");
//
//           }
//           System.out.println();
//
//       }

       int n = 5;
       for (int row = 1; row<=n; row++){
           for (int col = 1; col<=n-row+1;   col++) {
               System.out.print("* ");

           }
           System.out.println();
       }
   }
}
