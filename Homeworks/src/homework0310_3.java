import java.util.Scanner;

public class homework0310_3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int i = 0, a = 0;

        while (i < n) {
            a = scan.nextInt();
            if (x != a) {
                i++;
            } else {
                System.out.println("True");
                i = n;
            }

        }
    }
}
