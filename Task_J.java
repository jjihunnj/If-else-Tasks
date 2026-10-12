import java.util.Scanner;

public class Task_J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b =  in.nextInt();
        int c =  in.nextInt();
        int d =  in.nextInt();
        int priceKop = a * 100 + b;
        int paidKop = c * 100 + d;
        int changeKop = paidKop - priceKop;
        int e = changeKop / 100;
        int f = changeKop % 100;
        System.out.println(e + " " + f);
    }
}
