import java.util.Scanner;

public class primenotprime {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        if (n ==0){
            System.out.println("not prime");
            i = n;
        }
        while(i<n){
            if (n%i!= 0){
                i++;
            }
            else{
                i=n+1;
                System.out.println("not prime");
            }
        }
        if(i==n||n ==2){
            System.out.println("prime");
        }


    }
}
