import java.util.Scanner;

public class no_mass_less {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while (i < n) {
                int a = in.nextInt();
                if (a < 0) {
                    System.out.print("Yes");
                    i = n;
                }
                if ((i == n - 1) && (a > 0)) {
                    System.out.print("No");
                }
                i++;
        }
    }
}
