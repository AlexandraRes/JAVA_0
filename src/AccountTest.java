// Задание 3.15
import java.util.Scanner;
public class AccountTest {
    public static void displayAccount (Main_2 accountToDisplay){
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
    public static void main(String[] args) {
        Main_2 account1 = new Main_2("Jane Green", 50.00);
        Main_2 account2 = new Main_2("John Blue", -7.53);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        input.close();

        displayAccount(account1);
        displayAccount(account2);

    }
}
