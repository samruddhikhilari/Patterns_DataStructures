public class NormalABCD {
    public static void main(String[] args) {
        int n = 5;
        int counter = 65;
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) {// cols
                System.out.print(" " + (char) counter);
            }
            counter++;
            System.out.println();
        }
    }
}
