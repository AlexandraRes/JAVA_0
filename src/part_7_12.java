import java.util.Scanner;

public class part_7_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] uniqueNumbers = new int[5];
        int enteredNumbers = 0;

        System.out.println("Введите пять чисел от 10 до 100 включительно:");

        while (enteredNumbers < 5) {
            int enteredNumber = scanner.nextInt();

            if (enteredNumber >= 10 && enteredNumber <= 100) {
                if (!contains(uniqueNumbers, enteredNumber)) {
                    uniqueNumbers[enteredNumbers] = enteredNumber;
                    enteredNumbers++;

                    System.out.println("Уникальные числа: ");
                    for (int i = 0; i < enteredNumbers; i++) {
                        System.out.print(uniqueNumbers[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Число уже введено. Введите другое.");
                }
            } else {
                System.out.println("Введите число от 10 до 100 включительно.");
            }
        }
    }
    private static boolean contains(int[] массив, int значение) {
        for (int элемент : массив) {
            if (элемент == значение) {
                return true;
            }
        }
        return false;
    }
}
