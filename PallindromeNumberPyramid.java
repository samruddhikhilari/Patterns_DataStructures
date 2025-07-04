public class PallindromeNumberPyramid {

    public static void main(String[] args) {
        int n = 9;
        // rows
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first elements
            for (int p = i; p >= 1; p--) {
                System.out.print(p);
            }
            // second elements
            for (int q = 2; q <= i; q++) {
                System.out.print(q);
            }
            System.out.println();
        }
    }
}
