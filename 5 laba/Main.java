import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.println("Введiть номер завдання (1; 2; 3; 4), або 'q' для виходу:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                return;
            }

            switch (userInput) {
                case "1":
                    System.out.println("-------------------------------");
                    Task_1 task1 = new Task_1();
                    task1.Triangle();
                    break;
                case "2":
                    System.out.println("-------------------------------");
                    Task_2 task2 = new Task_2();
                    task2.ThreeNumbers();
                    break;
                case "3":
                    System.out.println("-------------------------------");
                    Task_3 task3 = new Task_3();
                    task3.ArrayOutput();
                    break;
                case "4":
                    System.out.println("-------------------------------");
                    Task_4 task4 = new Task_4();
                    task4.ArrayMaxSize();
                    break;
                default:
                    System.out.println("Неправильний ввiд. Введiть номер завдання (1; 2; 3; 4) або 'q' для виходу.");
                    break;
            }
        }
    }
}