public class part_7_16 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки для суммирования.");
            return;
        }

        double summ = 0;

        for (String arguments : args) {
            try {
                double values  = Double.parseDouble(arguments);
                summ += values ;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования аргумента " + arguments + " в число.");
            }
        }

        System.out.println("Сумма значений: " + summ);
    }
}
