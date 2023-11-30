import java.util.Scanner;

public class part_5_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int numbers = scanner.nextInt();

        if (numbers <= 0) {
            System.out.println("Error. Try again");
            return;
        }

        System.out.print("Enter the first number: ");
        int min = scanner.nextInt();

        for (int i = 1; i < numbers; i++) {
            System.out.print("Enter the second number ");
            int current = scanner.nextInt();

            if (current < min) {
                min = current;
            }
        }

        System.out.println("Min number is " + min);
    }
}
