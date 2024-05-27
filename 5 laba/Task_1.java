import java.util.Scanner;

public class Task_1 {

    public static double calculateArea(double a, double b) {

        return (a * b) / 2;
    }

    public void Triangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть довжину першого катета:");
        double side1 = 0;
        while (true) {
            if (scanner.hasNextDouble()) {
                side1 = scanner.nextDouble();
                if (side1 > 0) {
                    break;
                } else {
                    System.out.println("Довжина катета повинна бути бiльшою за 0. Введsть ще раз:");
                }
            } else {
                System.out.println("Введено некоректне значення. Введiть десяткове число:");
                scanner.next();
            }
        }

        System.out.println("Введiть довжину другого катета:");
        double side2 = 0;
        while (true) {
            if (scanner.hasNextDouble()) {
                side2 = scanner.nextDouble();
                if (side2 > 0) {
                    break;
                } else {
                    System.out.println("Довжина катета повинна бути бiльшою за 0. Введiть ще раз:");
                }
            } else {
                System.out.println("Введено некоректне значення. Введiть десяткове число:");
                scanner.next();
            }
        }

        double area = calculateArea(side1, side2);

        System.out.println("Площа прямокутного трикутника з катетами " + side1 + " i " + side2 + " дорiвнює " + area);

    }
}