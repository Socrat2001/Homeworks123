import java.util.Scanner;

public class new_k {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = 0, b;
        k = 26 - k;
        while(a != -1){
            a = in.nextInt();
            b = a + k;
            b = b % 26;
            System.out.println(b);
        }
    }
}
