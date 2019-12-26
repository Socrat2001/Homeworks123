import java.util.Scanner;

public class mas3n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0, schet = 0, a = 0;
        while (i < n) {
            a = in.nextInt();
            if (a < 0) {
                schet++;
            }
            i++;
        }
        if (schet > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
