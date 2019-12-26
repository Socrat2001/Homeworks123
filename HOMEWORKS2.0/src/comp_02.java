import java.util.Scanner;

public class comp_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int x = 987654321;
        int a = 10, b = 1, c = 10, d = 1, num1, num2, l, k;
        l = j - i;
        while (i != 1) {
            a = a * 10;
            b = b * 10;
            i -= 1;
        }
        num1 = x % a;
        num1 = num1 / b;
        num1 = num1 * b;
        while (j != 1) {
            c = c * 10;
            d = d * 10;
            j -= 1;
        }
        num2 = x % c;
        num2 = num2 / d;
        num2 = num2 * d;
        x = x - num1;
        x = x - num2;
        k = 10;
        while(l != 1) {
            k = k * 10;
            l -= 1;
        }
        num1 = num1 * k;
        num2 = num2 / k;
        x = x + num1;
        x = x + num2;
        System.out.println(x);
    }
}
