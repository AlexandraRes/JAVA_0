import java.util.Scanner;
public class part_6_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны треугольника:");
        double Side_1 = scanner.nextDouble();

        System.out.println("Введите длину второй стороны треугольника:");
        double Side_2 = scanner.nextDouble();

        double hypoten_1 = hypotenuse(Side_1, Side_2);
        System.out.println("Гипотенуза для треугольника 1: " + hypoten_1);

        double hypoten_2 = hypotenuse(5, 12);
        System.out.println("Гипотенуза для треугольника 2: " + hypoten_2);

        double hypoten_3 = hypotenuse(8, 15);
        System.out.println("Гипотенуза для треугольника 3: " + hypoten_3);
    }

    private static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
