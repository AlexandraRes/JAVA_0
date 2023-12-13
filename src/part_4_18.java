// Задание 4.18
import java.util.Scanner;
public class part_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int customers, accountNumber, balanceOld, balanceNew, totalItems, totalCredit, creditLimit;
        System.out.print("Enter the number of customers: ");
        customers = input.nextInt();
        for (int i = 0; i < customers; i++) {
            System.out.printf("Enter the data for customer %d : %n", i+1);
            System.out.print("Enter the account number: ");
            accountNumber = input.nextInt();
            System.out.print("Enter the balance for beginning of the month: ");
            balanceOld = input.nextInt();
            System.out.print("The sum of all products in this month: ");
            totalItems = input.nextInt();
            System.out.print("The sum of all loans this month: ");
            totalCredit = input.nextInt();
            System.out.print("Credit limit: ");
            creditLimit = input.nextInt();
            balanceNew = balanceOld + totalItems - totalCredit;
            if (balanceNew > creditLimit) {
                System.out.printf("The credit limit has been exceeded for the client - %d%n", i+1);
            } else {
                System.out.printf("The credit limit hasn't been exceeded for the client - %d%n", i+1);
            }
        }
        input.close();
    }
}

