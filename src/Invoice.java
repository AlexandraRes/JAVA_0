// Задание 3.12
import java.util.Scanner;
public class Invoice {
    private String part_number;
    private String part_desc;
    private int part_purchased;
    private double part_price;

    public Invoice(String number, String desc,
                   int purchased, double price){
        this.part_number = number;
        this.part_desc = desc;
        this.part_purchased = purchased;
        this.part_price = price;
    }
    public String getPart_number(){
        return part_number;
    }
    public void setPart_number(String number){
        this.part_number = number;
    }
    public String getPart_desc(){
        return part_desc;
    }
    public void setPart_desc(String desc){
        this.part_desc = desc;
    }
    public int getPart_purchased (){
        return part_purchased;
    }
    public void setPart_purchased(int purchased){
        this.part_purchased = purchased;
    }
    public double getPart_price(){
        return part_price;
    }
    public void setPart_price(double price){
        this.part_price = price;
    }
    public void (double withdrawAmount){
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }


}