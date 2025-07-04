class MatrixEvenOdd {
    public static void main(String args[]) {
        int n = 9;
        // rows
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" " + ((i % 2 == 0) ? "0" : "1"));
            }
            System.out.println();
        }
    }
}