import java.util.Scanner;

public class num_two {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int i = 0;
            while (i < n) {
                int a = in.nextInt();
                if (a != 0) {
                    System.out.println(a);
                }
                i++;
            }
        }
    }

