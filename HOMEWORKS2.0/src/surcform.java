import java.util.Scanner;

public class surcform {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            double y = in.nextDouble();
            boolean a = true;
            a = ((x*x + y*y <= 1) && (x <= 0) && (y >= 0)) ||((x <= 1 ) && (y <= 1) && (y >= 1 -x)) || ((x >= 0) && (y <= 0) &&(y >= -1) &&(x <= -1)) || ((x >= -1)&&(y >= -1)&&(y <= -x -1));
            if (a) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
}
