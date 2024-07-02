package begin.Objects.src;

public class Employee {
    String name;
    Integer age;
    Integer salary;
    Location location;

    Employee(String name, Integer age, Integer salary, Location location) {
        this.name = name;
        this.age = age;
        this.salary=salary;
        this.location = location;
    }
    void raiseSalary() {
        this.salary+=100;
    }

}
