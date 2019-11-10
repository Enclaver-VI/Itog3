import java.util.Scanner;
public class DZ12 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку с пробелами:");
            String str = scanner.nextLine();
            String result = str.replaceAll("\\s", "");
            System.out.println("Строка без пробелов:\n" + result);

        }
    }

