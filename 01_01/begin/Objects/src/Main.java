package begin.Objects.src;

public class Main {
    public static void main(String[] args) {
        Employee madhangi = new Employee("Madhangi", 25, 280000, Location.BLR);
        Employee venky = new Employee("Venkatesh", 26, 300000, Location.BLR);
        venky.raiseSalary();
        System.out.println(madhangi.salary);
        System.out.println(venky.salary);
    }
}
