// Задание 4.24
import java.util.Scanner;
public class part_4_24 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        boolean counter = true;
        while (counter = true) {
            System.out.print("Введите результат: (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1) {
                passes++;
                counter = true;
                break;
            } else if (result == 2) {
                passes++;
                counter = true;
                break;
            }
            else {
                failures++;
                System.out.println("Пожалуйста, введите 1 (pass) или 2 (fail).");
                counter = false;
            }
        }
            System.out.printf("Верно: %d%nОшибок: %d%n", passes, failures);
    }
}
