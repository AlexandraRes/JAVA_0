// Задание 3.14
public class Date {
    private int day;
    private int month;
    private int year ;

    public Date (int day, int month, int year) {
        if (day > 0 && month > 0 && year > 0) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Date date = new Date(23, 9, 2023);
        date.displayDate();
    }
}
