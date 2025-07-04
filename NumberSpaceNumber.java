public class NumberSpaceNumber {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {// rows

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
