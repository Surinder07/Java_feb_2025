package mar29;

import java.util.Objects;

public final class Employee {
     private final int id;
     private final String name;
     private final String email;

     public Employee(int id, String name, String email) {
          this.id = id;
          this.name = name;
          this.email = email;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public String getEmail() {
          return email;
     }

     @Override
     public String toString() {
          return "Employee{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", email='" + email + '\'' +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Employee employee = (Employee) o;
          return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(email, employee.email);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id, name, email);
     }
}


class Main{
     public static void main(String[] args) {
          Employee e1 = new Employee(101, "Yadav","y@gmail.com");
          System.out.println(e1.getId());
          System.out.println(e1);

     }
}
