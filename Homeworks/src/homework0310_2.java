import java.util.Scanner;

public class homework0310_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0, a = 0;

        while (i < n) {
            a = scan.nextInt();
            if (a != 0) {
                System.out.println(a);
                i++;
            } else {
                i++;
            }

        }
    }
}
