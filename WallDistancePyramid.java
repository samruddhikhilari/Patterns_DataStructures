public class WallDistancePyramid {

    public static int calculateValue(int n, int i, int j) {
        int start = 1;

        // up & down
        int up = Math.abs(i - start);
        int down = Math.abs(n - i);
        // left right
        int left = Math.abs(j - start);
        int right = Math.abs(n - j);

        return Math.min(Math.min(up, down), Math.min(left, right));
    }

    public static void main(String[] args) {

        int n = 5;
        // rows
        for (int i = 1; i <= 2 * n; i++) {
            // cols
            for (int j = 1; j <= 2 * n; j++) {
                int val = calculateValue(n * 2, i, j);
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
