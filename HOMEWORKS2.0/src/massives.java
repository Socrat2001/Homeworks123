import java.util.Scanner;

public class massives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n];
        int i = 0, j = 0, k = 0;
        while (i < n) {
            a[i] = in.nextInt();
            i++;
        }
        i = 0;
        while (i < m) {
            b[i] = in.nextInt();
            i++;
        }
        i = 0;
        int d = 0;
        while (i < n) {
            while (j < m) {
                if (a[i] == b[j]) {
                    d++;
                }
                j++;
            }
            if (d == 0) {
                c[k] = a[i];
                System.out.println(c[k]);
            }
            else {
                d--;
            }
            i++;
            j = 0;
        }
    }
}
