import java.util.Scanner;

public class deshifr {
    //известно, что начало hello
    //7;4;11;11;14
    //finish by -1
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = 0, k = 0;
        while (i < 1) {
            int a = scan.nextInt();
            k = a - 7;
            i++;
        }
        while (i != -1) {
            int a = scan.nextInt();
            if (a != -1) {
                a = a - k;
                a = a%26;
                System.out.println("a = " + a);
            } else {i = -1;}
        }
    }
}
