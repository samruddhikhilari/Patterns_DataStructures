public class NumberMatrix {

    public static int getDistance(int end, int currRow, int currCol) {
        int start = 1;
        int up = currRow - start;
        int down = end - currRow;

        int left = currCol - start;
        int right = end - currCol;

        return Math.min(Math.min(up, down), Math.min(left, right));
    }

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n - getDistance(n, i, j) + " ");
            }
            System.out.println();
        }
    }
}
