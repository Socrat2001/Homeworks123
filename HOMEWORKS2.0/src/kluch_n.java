import java.util.Scanner;

public class kluch_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int ch = 1, k = 7, b;
        k = a - k;
        k = 26 - k;
        while (ch < n) {
            a = in.nextInt();
            b = a + k;
            b = b % 26;
            ch = ch + 1;
            System.out.print(b);
        }
    }
}
