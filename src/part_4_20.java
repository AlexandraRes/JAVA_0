// Задание 4.20
import java.util.Scanner;
public class part_4_20 {
    public static double calculGrossPay(double hoursWorked, double hourlyRate) {
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyRate;
            overtimePay = (hoursWorked - 40) * 1.5 * hourlyRate;
        }

        return regularPay + overtimePay;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int employee = 1; employee <= 3; employee++) {
            System.out.println("Введите информацию о сотруднике #" + employee);
            System.out.print("Количество отработанных часов: ");
            double hoursWorked = scanner.nextDouble();
            System.out.print("Почасовая ставка: $");
            double hourlyRate = scanner.nextDouble();

            double grossPay = calculGrossPay(hoursWorked, hourlyRate);
            System.out.println("Валовая заработная плата сотрудника #" + employee + ": $" + grossPay);
        }

        scanner.close();
    }

}
