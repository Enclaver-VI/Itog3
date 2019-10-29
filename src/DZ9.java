import java.util.Scanner;

public class DZ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Необходимо ввести размер массива: ");

        int mas = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в mas
        int array[] = new int[mas]; // Создаём массив int размером в mas

        System.out.println("Необходимо ввести элементы массива:");

        /*Пробежимся по всему массиву заполняя его*/
        for (int i = 0; i < mas; i++) {
            array[i] = scanner.nextInt(); // Заполним массив элементами, введёнными с клавиатуры
        }
        System.out.print("Выводим массив, в котором каждый элемент умножен на 2: \n");
        for (int i = 0; i < mas; i++) {
            System.out.print(array[i] * 2 + " "); // Выводим на экран каждый элемент массива, умноженный на 2
        }
        System.out.println();
    }
}

