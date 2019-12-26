import java.util.Scanner;

public class check_sq {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            double y = in.nextDouble();
            boolean a = true;

            if (((x*x + y*y <= 1) && !((x > 0)&&(y > 0)) && !((x < 0) && (y < 0)) || (x*x + y*y == 1 ))) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
}
