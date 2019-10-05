import java.util.Arrays;
import java.util.Scanner;

public class homework0310_4a {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int i = 0, j = 0, l = 0, max = 0;
        //заводим массивы
        int[] a = new int[n];
        int[] b = new int[m];


        //считываем элементы массивов a и b
        while (i <n) {
            a[i] = scan.nextInt();
            i++;
        }//массив a с n элементами
        while (j < m) {
            b[j] = scan.nextInt();
            j++;
        }

        if(a[n-1]>=b[m-1]){
            max = a[n-1];
        }
        else {
            max = b[m-1];
        }
        int[] c = new int[max];

        while (l<n){
            c[l] = a[l];

        }
    }
}
//зафигачить все в один массив, без повторений
//объединить. и втом и вдругом
// то что есть в одном но нет в другом