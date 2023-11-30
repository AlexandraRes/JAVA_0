import java.util.Scanner;
public class part_6_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону квадрата: ");
        int side = scanner.nextInt();

        System.out.print("Введите символ заполнения: ");
        char fillSymbol = scanner.next().charAt(0);

        squareWithCustomSymbol(side, fillSymbol);
    }

    private static void squareWithCustomSymbol(int side, char fillSymbol) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillSymbol);
            }
            System.out.println();
        }
    }
}
