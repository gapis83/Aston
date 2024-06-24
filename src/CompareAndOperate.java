import java.util.Scanner;

public class CompareAndOperate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();

        compareNumbers(a, b);
        performOperations(a, b);

        scanner.close();
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performOperations(int a, int b) {
        System.out.printf("Сумма: %d%n", a + b);
        System.out.printf("Разность: %d%n", a - b);
        System.out.printf("Произведение: %d%n", a * b);

        if (b == 0) {
            System.out.println("Делить на ноль нельзя. Результат \"a / b\" не определен");
        } else {
            System.out.printf("Деление: %.2f%n", (double) a / b);
        }
    }
}
