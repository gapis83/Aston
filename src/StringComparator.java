import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите две строки:");

            String a = scanner.nextLine();
            String b = scanner.nextLine();

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        }
    }
}