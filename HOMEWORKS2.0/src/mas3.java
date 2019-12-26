import java.util.Scanner;

public class mas3 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            int i = 0, schet = 0;
            while (i < n) {
                a[i] = in.nextInt();
                if (a[i] < 0) {
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


