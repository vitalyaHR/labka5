import java.util.Scanner;

public class Task_3 {

    public void ArrayOutput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть розмiр масиву:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Введений масив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " \n");
        }
    }
}