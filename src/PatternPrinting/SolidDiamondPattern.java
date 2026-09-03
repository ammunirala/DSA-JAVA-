package PatternPrinting;

public class SolidDiamondPattern {
    public static void main(String[] args) {

        int n = 4;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Stars and middle spaces
            for (int col = 1; col <= 2 * row - 1; col++) {

                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // Stars and middle spaces
            for (int col = 1; col <= 2 * row - 1; col++) {

                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}