public class DecrementedABCD {

    public static int sumOfDigit(int num) {

        int sum = 0;
        int temp = num;
        while (temp >= 0) {
            sum += temp--;
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 5;
        int counter = 64 + sumOfDigit(n);

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // cols
                System.out.print(" " + ((char) (counter--)));
            }
            System.out.println();
        }
    }
}
