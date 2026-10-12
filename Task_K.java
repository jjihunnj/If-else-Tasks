import java.util.Scanner;
import java.util.Scanner;

public class Task_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        if (k == 1 || k == 2 || k == 4 || k == 7) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
