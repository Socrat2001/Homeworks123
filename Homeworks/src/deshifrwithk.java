import java.util.Scanner;

public class deshifrwithk {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int i = 0;

        while (i != -1) {
            int a = scan.nextInt();
            if (a != -1) {
                a = a + k;
                a = a%26;
                System.out.println("a = " + a); }
            else {i = -1;}
        }
    }
}

