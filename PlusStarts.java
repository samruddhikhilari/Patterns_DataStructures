public class PlusStarts {

    public static void main(String[] args) {
        float n = 5;

        int position = (int) Math.ceil(n / 2);

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n; j++) { // cols

                System.out.print((i == position || j == position) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
