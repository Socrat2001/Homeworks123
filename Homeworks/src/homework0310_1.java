import java.util.Scanner;


//with massive
    public class homework0310_1 {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int []a=new int[n];
            int i = 0;
            while (i < n) {
                a[i] = scan.nextInt();
                if (a[i] >= 0) {
                    if (i == n - 1) {
                        System.out.printf("False");
                    }
                    i++;
                } else {
                    System.out.println("True");
                    i = n;
                }
            }
        }
    }

