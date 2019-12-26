import java.util.Scanner;

public class acmp_try {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            char[] way = input.toCharArray();
            int n = way.length;
            int[] num = new int[n];
            int[] sum = new int[2];
            num = GetNumbers(n, way, num);
            sum = Massive_Sum(num, n, sum);
            String a = Revers_Symbol(num, sum);
            System.out.println(a);
        }

        public static int[] GetNumbers(int n, char[] way, int[] num) {
            for (int i = 0; i < n; i++) {
                if ((int) way[i] == 78) {
                    num[i] = 1;
                }
                if ((int) way[i] == 83) {
                    num[i] = -1;
                }
                if ((int) way[i] == 87) {
                    num[i] = 2;
                }
                if ((int) way[i] == 69) {
                    num[i] = -2;
                }

            }
            return num;
        }

        public static int[] Massive_Sum(int[] num, int n, int[] sum) {
            for (int i = 0; i < n; i++) {
                if (num[i] % 2 == 0) {
                    sum[0] = sum[0] + num[i];
                } else {
                    sum[1] = sum[1] + num[i];
                }
            }
            return sum;
        }

        public static String Revers_Symbol(int[] num, int[] sum) {
            int n = sum[0]/2;
            String a = new String();
            if (sum[1] < 0) {
                for (int i = 0; i < Math.abs(sum[1]); i++) {
                    a += "N";
                }
            }
            if (sum[0] > 2) {
                for(int i=0;i<Math.abs(n);i++) {
                    a += "E";
                }
            }
            if(sum[0]==2){
                a  = a+"E";
            }
            if (sum[1] > 0){
                for(int i =0;i<Math.abs(sum[1]);i++) {
                    a += "S";
                }
            }
            if (sum[0] < 2) {
                for (int i = 0; i < Math.abs(n); i++) {
                    a += "W";
                }
            }
            if(sum[0]<0&&sum[0]>-2) {
                a = a+"W";
            }
            return a;
        }
    }

