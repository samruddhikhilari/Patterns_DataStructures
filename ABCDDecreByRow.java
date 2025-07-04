public class ABCDDecreByRow {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            int counter = 64 + n;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) counter-- + " ");
            }
            System.out.println();
        }
    }
}
