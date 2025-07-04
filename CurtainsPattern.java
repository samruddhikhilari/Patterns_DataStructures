public class CurtainsPattern {

    public static void main(String[] args) {
        int n = 7;

        // lower
        for (int i = 1; i <= n; i++) {
            // ele's
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j < (i * 2) - 1; j++) {
                System.out.print("  ");
            }
            // eles
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // upper
        for (int i = 1; i <= n; i++) {
            // ele's
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= ((n - i) * 2); j++) {
                System.out.print("  ");
            }
            // eles
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
