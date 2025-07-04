public class PallindromeABCD {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= n - i + 1; j++) { // cols
                System.out.print(" ");
            }
            int counter = 65;
            // abcd
            for (int j = 1; j <= i; j++) {
                System.out.print((char) counter++);
            }
            // abcd
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) --counter);
            }
            System.out.println();
        }
    }
}
