import java.util.Scanner;

public class part_5_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] price = {2.98, 4.50, 9.98, 4.49, 6.87};
        double generalPrice = 0;
        System.out.println("Введите номер продукта и количество проданных товаров (для завершения введите 0):");
        int numberProd;
        do {
            System.out.print("Номер продукта (1-5): ");
            numberProd = scanner.nextInt();
            if (numberProd >= 1 && numberProd <= 5) {
                System.out.print("Проданное количество: ");
                int guantitySold = scanner.nextInt();
                generalPrice += price[numberProd - 1] * guantitySold;
            } else if (numberProd != 0) {
                System.out.println("Введите корректный номер продукта (1-5) или 0 для завершения.");
            }
        }
        while (numberProd != 0);
        System.out.println("Общая розничная стоимость продаж: $" + generalPrice);
    }
}
