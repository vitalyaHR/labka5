import java.util.Scanner;

public class Task_4 {

    public void ArrayMaxSize() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть розмiр масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Найбiльше число в масивi: " + max);
    }
}