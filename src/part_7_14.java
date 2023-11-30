public class part_7_14 {
    public static void main(String[] args) {
        int result1 = product(2, 3, 4);
        int result2 = product(5, 7, 10, 2);
        int result3 = product(1, 2, 3, 4, 5, 6);

        System.out.println("Произведение (2, 3, 4): " + result1);
        System.out.println("Произведение (5, 7, 10, 2): " + result2);
        System.out.println("Произведение (1, 2, 3, 4, 5, 6): " + result3);
    }

    private static int product(int... number) {
        if (number.length == 0) {
            return 0;
        }

        int multiple = 1;
        for (int num : number) {
            multiple *= num;
        }
        return multiple;
    }
}
