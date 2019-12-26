import java.util.Scanner;

public class am_sempt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y,a,b,c,d;
        a = n;
        y = 0;
        c = 1;
        d = 1;
        while (a > 0){
            d = d * x;
            b = d / c;
            y = y + b;
            a -= 1;
            c += 1;
        }
        System.out.println(y);
    }
}
