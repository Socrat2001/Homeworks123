import java.util.Scanner;

public class abr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int c = 1;
        int a = x;
        if (n == 0) {
            System.out.print(1);
        }
        else {
            while ((c * c) < n) {
                c = c * 2;
                x = x * x;
            }
            while (c < n) {
                c = c + 1;
                x = x * a;
            }
            System.out.print(x);
        }
    }
}
