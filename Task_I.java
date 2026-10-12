import java.util.Scanner;

public class Task_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (n == 0) {
            if (k == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        }
        else {
            if (-k % n != 0) {
                System.out.println("NO");
            }
            else {
                int x = -k / n;
                if (c * x + d == 0) {
                    System.out.println("NO");
                }
                else {
                    System.out.println(x);
                }
            }
        }
    }
}
