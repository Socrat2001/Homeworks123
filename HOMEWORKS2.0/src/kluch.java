import java.util.Scanner;

public class kluch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = 0;
        while(a != -1){
            a = in.nextInt();
            a = a + k;
            a = a % 26;
            System.out.println(a);
        }
    }
}
