import java.util.Scanner;
public class Main_2 {
    private String name;
    private double balance;
    public Main_2(String name, double balance){
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public void deposit (double depositAmount){
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    public void withdraw (double withdrawAmount){
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Main_2 Account = new Main_2("Alexandra", 2100000000);

        Account.withdraw(1000);
        System.out.println(Account.getBalance());;
    }
}
