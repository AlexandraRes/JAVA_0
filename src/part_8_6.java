
public class part_8_6 {
    private static double annualInterestRate;
    private double savingsBalance;

    public part_8_6(double balance) {
        this.savingsBalance = balance;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        part_8_6 saver1 = new part_8_6(2000.00);
        part_8_6 saver2 = new part_8_6(3000.00);

        part_8_6.modifyInterestRate(0.04); // Set annual interest rate to 4%

        System.out.println("Начальные остатки:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());

        // Расчет ежемесячных процентов за 12 месяцев при 4% годовой процентной ставке
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("\nОстатки после 12 месяцев с 4% годовой ставкой:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());

        part_8_6.modifyInterestRate(0.05); // Set annual interest rate to 5%

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nОстатки после еще одного месяца с 5% годовой ставкой:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());
    }
}