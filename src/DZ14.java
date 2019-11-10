import java.util.Scanner;
public class DZ14 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            String s = scanner.nextLine();

            double d = Double.parseDouble(s);
            int x = (int) d;
            System.out.println("Число типа String:\n" + s);
            System.out.println("Число типа int:\n" + x);
            System.out.println("Число типа double:\n" + d);
        }
    }



