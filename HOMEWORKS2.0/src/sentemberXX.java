import java.util.Scanner;

public class sentemberXX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        long c;
        c = 1;
        while(n != 0) {
            c = c * x;
            n -= 1;
        }
        System.out.println(c);
    }
}
