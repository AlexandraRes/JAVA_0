
public class part_8_4 {
    private double length;
    private double width;

    public part_8_4() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (isValidLength(length)) {
            this.length = length;
        } else {
            System.out.println("Недопустимая длина. Длина должна быть числом с плавающей запятой больше 0.0 и меньше 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (isValidWidth(width)) {
            this.width = width;
        } else {
            System.out.println("Недопустимая ширина. Ширина должна быть числом с плавающей запятой больше 0.0 и меньше 20.0");
        }
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    private boolean isValidLength(double length) {
        return length > 0.0 && length < 20.0;
    }

    private boolean isValidWidth(double width) {
        return width > 0.0 && width < 20.0;
    }

    public static void main(String[] args) {
        part_8_4 rectangle = new part_8_4();

        rectangle.setLength(5.0);
        rectangle.setWidth(10.0);

        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
    }
}