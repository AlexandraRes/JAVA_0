// Задание 4.23
// НЕ РАБОТАЕТ
import java.util.Scanner;
public class part_4_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, N = 10;
        int count = 1;
        int large_1 = 0;
        int large_2 = 0;
        int[] arr = new int [N];

        while (count <= 10) {
            System.out.print("Введите целое число #" + count + ": ");
            int number = scanner.nextInt();
            for (i = 0; i <= arr.length; i++){
                if (arr[i] != number){
                    arr[i] = number;
                } else {
                    System.out.print("FALSE%n");
                    break;
                }
            }
            if (count == 1) {
                large_1 = number;
            } else {
                if (number > large_1) {
                    large_2 = number;
                }
            }
            count++;
        }
        System.out.println("Наибольшее 1 целое число: " + large_1);
        System.out.println("Наибольшее 2 целое число: " + large_2);

        scanner.close();
    }
}
