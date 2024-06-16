class Employee
{
    private int eid;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int eid, String firstName, String lastName, double salary) {
        this.eid = eid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Employee other) {
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    public boolean hasGreaterSalary(Employee other) {
        return this.salary > other.salary;
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        // create some employees
        Employee alice = new Employee(1, "Alice", "Smith", 50000);
        Employee bob = new Employee(2, "Bob", "Jones", 60000);
        Employee carol = new Employee(3, "Carol", "Lee", 55000);

        // test getting and setting attribute values
        alice.setSalary(55000);
        System.out.println(alice.getSalary());

        // test comparing employees based on salary
        System.out.println(bob.hasGreaterSalary(alice)); // should print true
        System.out.println(carol.hasGreaterSalary(bob)); // should print false

        // test identifying duplicate employees based on first and last name
        Employee alice2 = new Employee(4, "Alice", "Smith", 55000);
        System.out.println(alice.equals(alice2)); // should print true
        System.out.println(alice.equals(bob)); // should print false
    }
}

