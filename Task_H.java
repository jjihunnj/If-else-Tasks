import java.util.Scanner;

public class Task_H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if (n == 0) {
            if (k == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        }
        else {
            if (-k % n == 0) {
                System.out.println( (-k)/n );
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
