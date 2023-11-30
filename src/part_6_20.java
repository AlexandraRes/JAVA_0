import java.util.Scanner;
public class part_6_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double rad = scanner.nextDouble();
        double square = circleArea(rad);
        System.out.println("Площадь круга с радиусом " + rad + " равна: " + square);
    }

    private static double circleArea(double rad) {
        return Math.PI * Math.pow(rad, 2);
    }
}
