import java.util.Scanner;

public class zero_less {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int i = 0;
        while (i < n) {
            int a = in.nextInt();
            if (a == x) {
                System.out.println("Yes");
                i = n;
            }
            if ((a > x) || (i == n - 1)) {
                System.out.print("No");
                i = n;
            }
            i++;
        }
    }
}


