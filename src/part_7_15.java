public class part_7_15 {
    public static void main(String[] args) {
        int arrLength = 10;

        if (args.length > 0) {
            try {
                arrLength = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный аргумент командной строки. Используется размер массива по умолчанию (10).");
            }
        }

        int[] array = new int[arrLength];

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
