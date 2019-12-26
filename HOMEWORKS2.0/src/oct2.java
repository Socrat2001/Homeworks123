import java.util.Scanner;

public class oct2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (y >= 0) {
            if (y <= x + 1) {
                if (y <= -x + 1) {
                    System.out.print("Yes");
                }
                else {
                    System.out.print("No");
                }
            }
            else {
                System.out.print("No");
            }
        }
        else {
            System.out.print("No");
        }

    }
}
