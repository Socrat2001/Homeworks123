import java.util.Scanner;

public class abc_new {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int i = 0, j = 0;
        int l = 1;
        int[][] a = new int[n][n];
        while (i < n) {
            while (j < m) {
                a[i][j] = in.nextInt();
                j++;
            }
            j = 0;
            i++;
        }
        i = 0;
        j = 1;
        while (i < n) {
            while (j < n) {
                m = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = m;
                j++;
            }
            l++;
            j = l;
            i++;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

