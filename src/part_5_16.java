import java.util.Scanner;

public class part_5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 5 numbers in arrange 1-30: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number < 1 || number > 30) {
                System.out.println("Error. Try again");
                i--;
            } else {
                numbers[i] = number;
            }
        }
        for (int number : numbers){
            for (int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}