// Задание 3.12
import java.util.Scanner;
import java.text.DecimalFormat;
public class Invoice {
    private String partNumber;
    private String partDesc;
    private int partPurchased;
    private double partPrice;

    public Invoice(String number, String desc,
                   int purchased, double price){
        this.partNumber = number;
        this.partDesc = desc;
        this.partPurchased = purchased;
        this.partPrice = price;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartNumber(String number){
        this.partNumber = number;
    }
    public String getPartDesc(){
        return partDesc;
    }
    public void setPartDesc(String desc){
        this.partDesc = desc;
    }
    public int getPartPurchased (){
        return partPurchased;
    }
    public void setPartPurchased(int purchased){
        this.partPurchased = purchased;
    }
    public double getPartPrice(){
        return partPrice;
    }
    public void setPartPrice(double price){
        this.partPrice = price;
    }

    public void getInvoiceAmount (){
        double sum = partPrice * partPurchased;
        if (sum < 0){
            sum = 0;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSum = df.format(sum);
        System.out.println("\nThe amount of your receipt: $" + formattedSum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        double P;
        System.out.print("\nEnter the number of parts: ");
        N = input.nextInt();
        System.out.print("\nThe price for one part is 50$");
        P = 50;
        Invoice Account = new Invoice("N154", "for the car", N, P);
        input.close();
        Account.getInvoiceAmount();
    }


}