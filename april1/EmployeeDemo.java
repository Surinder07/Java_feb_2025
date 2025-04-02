package april1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Ankita"));
        list.add(new Employee(102, "Yadav"));
        list.add(new Employee(103, "Nikhil"));
        list.add(new Employee(104, "Manmeet"));
        list.add(new Employee(105, "Simran"));

        System.out.println(list);
        // add another filed as salary and find the employee name with highest salary.
        // use java 8 streams api to find the highest salary. - Later



    }
}
