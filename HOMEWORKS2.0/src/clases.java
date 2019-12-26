import java.util.Scanner;

public class clases {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);


            Student albert = new Student("Alex","Klepalov", "Ilich");

            albert.setAlgMark(5);
            albert.setInfoMark(5);
            albert.setMathMark(4);

            String albertInfoMark = albert.getInfoMark();
            System.out.println(albertInfoMark);

        }
    }


