    import java.io.*;

    public class DZ16 {
        public static void main(String[] args) {
            String s;
            System.out.println("Вывод текста из файла:\n");
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Вадим\\Desktop\\ТО 2019.txt"))) {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException exc) {
                System.out.println("Ошибка ввода вывода:" + exc);
            }

        }
    }

