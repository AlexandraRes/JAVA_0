// Задание 3.13
public class EmployeeTest {
    private String name;
    private String surname;
    private double salary;

    public EmployeeTest (String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        if (salary > 0.0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeTest Maxim = new EmployeeTest("Maxim", "Ianac", 20000);
        EmployeeTest Alexandra = new EmployeeTest("Alexandra", "Resitco", 30000);

        System.out.println("Salary per year Maxim: " + Maxim.getSalary()*12);
        System.out.println("Salary per year Alexandra: " + Alexandra.getSalary()*12);

        Alexandra.setSalary(Alexandra.getSalary()*1.1);
        System.out.println("\nSalary per month Alexandra: " + Alexandra.getSalary());

        Maxim.setSalary(Maxim.getSalary()*1.1);
        System.out.println("Salary per month Maxim: " + Maxim.getSalary());
    }
}
