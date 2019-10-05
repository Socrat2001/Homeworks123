import java.util.Scanner;
//Дан ключ. -> последний -1
public class shifr {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        //int a = scan.nextInt();
        int i = 0;
        while(i!=-1){ int a = scan.nextInt();
            if(a ==-1){i =-1;}
            else {
                if (a > 25 - k) {
                    a = a + k;
                    a = a % 26;
                } else {
                    a = a + k;
                }

                System.out.println("a = " + a);
            }
        }


    }

}
