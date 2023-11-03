// Задание 4.21
import java.util.Scanner;
public class part_4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int large = 0;

        while (count <= 10) {
            System.out.print("Введите целое число #" + count + ": ");
            int number = scanner.nextInt();

            if (count == 1) {
                large = number;
            } else {
                if (number > large) {
                    large = number;
                }
            }
            count++;
        }
        System.out.println("Наибольшее целое число: " + large);

        scanner.close();
    }
}
