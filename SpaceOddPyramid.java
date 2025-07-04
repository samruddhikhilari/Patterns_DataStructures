public class SpaceOddPyramid {

    public static void main(String args[]) {
        int n = 5;

        int counter = 1;

        for (int i = n; i >= 1; i--) {// rows
            for (int j = 1; j <= i; j++) {// spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= counter; j++) {
                System.out.print("*");
            }

            counter += 2;
            System.out.println();
        }
    }
}
