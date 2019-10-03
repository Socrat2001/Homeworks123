//No massive
import java.util.Scanner;

public class homework0310 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0, x = 0;
        while (i < n) {
            x = scan.nextInt();
            if (x >= 0) {
                if (i == n - 1) {
                    System.out.printf("False");
                }
                i++;
            } else {
                System.out.println("True");
                i = n;
            }
        }
    }
}