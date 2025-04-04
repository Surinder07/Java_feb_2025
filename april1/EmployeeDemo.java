package april1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Ankita",2000.33));
        list.add(new Employee(102, "Niraj",22.23));
        list.add(new Employee(103, "Yadav",2323));
        list.add(new Employee(104, "Simran",23000.33));

        Employee maxSalary = list.get(0);
        for (Employee e: list) {
            if(e.salary > maxSalary.salary){
                maxSalary = e;
            }
        }
        System.out.println(maxSalary);


        // add another filed as salary and find the employee name with highest salary.
        // use java 8 streams api to find the highest salary. - Later



    }
}
