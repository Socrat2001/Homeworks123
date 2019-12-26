import java.util.Scanner;

public class no_massives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int i = 0, a = 0, sc = 0;
        while (i < n) {
            a = in.nextInt();
            if (a == x) {
                sc++;
            }
            i++;
        }
        if (sc > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
