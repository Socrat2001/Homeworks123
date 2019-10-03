import java.util.Arrays;
import java.util.Scanner;

public class homework0310_4a {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int i = 0, j = 0, l = 0;
        //заводим массивы
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n+m];

        //считываем элементы массивов a и b
        while (i <n) {
            a[i] = scan.nextInt();
            i++;
        }//массив a с n элементами
        //System.out.println("a= " + aString);
        while (j < m) {
            b[j] = scan.nextInt();
            j++;
        }//System.out.println("b= " + b);//массив b с m элементами

        while (l < n + m) {
            /*if(a[l] == b[l]){
                c[l] = a[l];
            }*/
            if (a[l] < b[l]) {
                c[l] = a[l];
                l++;
            } else {
                c[l] = b[l];
                l++;
            }

            
        }

        while (l<n+m){
            System.out.println("c[l] = " + c[l]);
            l=l+1;
        }
    }
}