import java.util.Scanner;

public class Task_L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n <= k) {
            System.out.println(2 * m);
        } else {
            int batches = (2 * n + k - 1) / k;
            System.out.println(batches * m);
        }
    }
}