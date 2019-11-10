    import java.util.Scanner;

    public class Itog1 {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);

            System.out.println("Введите число в бинарном формате:");
            int n = s.nextInt();

            int dec = 0, p = 0;

            while (n != 0) {
                dec += ((n % 10) * Math.pow(2, p));
                n = n / 10;
                p++;
            }

            System.out.printf("Число в десятичном формате:\n%d", dec);
        }
    }



