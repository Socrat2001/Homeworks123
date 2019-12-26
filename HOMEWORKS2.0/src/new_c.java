import java.util.Scanner;

public class new_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int del = 0;
        int k = 3;
        if (n == 2) {
            System.out.println("prime");
        }
        else {
            if (n % 2 == 0) {
                del += 1;
            }
            while (k < (n / 2)) {
                if (n % k == 0) {
                    del += 1;
                }
                k += 2;
            }
            if (del == 0) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
