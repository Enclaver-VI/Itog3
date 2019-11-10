    import java.util.Scanner;

    public class DZ15 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер массива: ");

            int size = input.nextInt();
            int array[] = new int[size];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.println("Введенный массив:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int min_i = i;
                for (int j = i + 1; j < array.length; j++) {
                    //Если находим, запоминаем его индекс
                    if (array[j] < min) {
                        min = array[j];
                        min_i = j;
                    }
                }

                if (i != min_i) {
                    int tmp = array[i];
                    array[i] = array[min_i];
                    array[min_i] = tmp;
                }
            }

            System.out.println("\nМассив, полученный после сортировки:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

