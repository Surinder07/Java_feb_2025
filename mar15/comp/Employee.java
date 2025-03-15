package mar15.comp;

public class Employee {
    private int id;
    private String name;  // FirstName, MiddleName, LastName
    private String email;
    private Address address;
    private double salary; // Base Bonus

    public Employee(int id, String name, String email, Address address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
