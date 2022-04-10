public class floydstriangle {
    public static void main(String[] args) {
        int rows = 4; // giving the number of rows
        int i, j;
        int k = 1;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");
        }
    }
}
