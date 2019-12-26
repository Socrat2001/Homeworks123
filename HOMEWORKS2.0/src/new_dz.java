import java.util.Scanner;

public class new_dz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        boolean a = true;
        a = ((y <= 1) && (y >= -1) && (x <= 1) && (x >= -1)) && !((y < x + 1) && (x < 0) && (y > 0)) && !((y > x - 1) && (x > 0) && (y < 0)) ;
        if (a) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
