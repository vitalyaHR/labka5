import java.util.Scanner;

public class Task_2 {

    public void ThreeNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вам необхiдно ввести три числа, програма виведе найменше з них.");

        System.out.println("Введіть перше число:");
        double number1 = scanner.nextDouble();

        System.out.println("Введіть друге число:");
        double number2 = scanner.nextDouble();

        System.out.println("Введіть третє число:");
        double number3 = scanner.nextDouble();

        double min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        System.out.println("Найменше число: " + min);
    }
}