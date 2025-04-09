package april8.comparable;

public class Employee implements Comparable<Employee>{
    int id;
    String name;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.id- employee.id;
    }
}
/*
-ve       if o1<o2  104 - 105       = -1
0       if o1 = o2
+ve     if o1 > o2


       [-  30]  - negative

          20 - 10  -- postive
 */