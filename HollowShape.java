public class HollowShape {

    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) // rows
        {
            for (int j = 1; j <= n; j++) { // cols

                System.out.print((i == 1 || i == n || j == 1 || j == n) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
