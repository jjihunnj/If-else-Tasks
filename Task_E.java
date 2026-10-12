import java.util.Scanner;

public class Task_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (((x1+1 == x2) || (x1-1 == x2)) && ((y1+2 == y2) || (y1-2 == y2))) {
            System.out.println("YES");
        }
        else if (((y1+1 == y2) || (y1-1 == y2)) && ((x1+2 == x2) || (x1-2 == x2))) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
