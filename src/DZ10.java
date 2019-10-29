import java.util.Scanner;

public class DZ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо задать размер матрицы, сначала введем количество строк, затем количество столбцов: ");
        int line = scanner.nextInt(); // Читаем с клавиатуры количество строк и записываем в line
        int column = scanner.nextInt(); // Читаем с клавиатуры количество столбцов и записываем в column
        int array[][] = new int[line][column]; // Создаём матрицу размером в rows*cols
        System.out.println("Введите элемент матрицы");

        /*Пробежимся по всей матрице и заполним ее*/
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Необходимо ввести элемент [" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Вывод результата перемножения первой строки матрицы, в котором каждый элемент умножен на 3: \n");
        for (int j = 0; j < line; j++) {
            System.out.print(array[0][j] * 3 + " ");
        }
        System.out.println();
    }
}

