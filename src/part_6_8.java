import java.util.Scanner;
public class part_6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double generalPrice = 0;
        System.out.print("Введите количество клиентов: ");
        int quantityClient = scanner.nextInt();

        for (int i = 0; i < quantityClient; i++) {
            System.out.print("Введите количество часов для клиента " + (i + 1) + ": ");
            int time = scanner.nextInt();

            double price = calculateCharges(time);
            generalPrice += price;

            System.out.println("Плата за клиента " + (i + 1) + ": $" + price);
        }

        System.out.println("Общая сумма поступлений за вчерашний день: $" + generalPrice);
    }

    private static double calculateCharges(int time) {
        double minPrice = 2.00;
        double addPrice = 0.50;
        double maxPrice = 10.00;

        if (time <= 3) {
            return minPrice;
        } else {
            double addTime = time - 3;
            double price = minPrice + (addTime * addPrice);

            return Math.min(price, maxPrice);
        }
    }
}
