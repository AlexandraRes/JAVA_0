// Задание 4.19
import java.util.Scanner;
public class part_4_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weekSal = 200.0;
        double commissionR = 0.09;
        double totalSales = 0.0;

        System.out.println("Введите стоимость проданных товаров (для завершения введите 0):");

        double saleAmount;
        do {
            System.out.print("Стоимость товара: ");
            saleAmount = scanner.nextDouble();

            if (saleAmount > 0) {
                totalSales += saleAmount;
            }
        } while (saleAmount > 0);

        double commission = totalSales * commissionR;
        double earnings = weekSal + commission;

        System.out.println("Общая сумма продаж: $" + totalSales);
        System.out.println("Комиссия продавца (9%): $" + commission);
        System.out.println("Заработок продавца за неделю: $" + earnings);

        scanner.close();
    }
}
