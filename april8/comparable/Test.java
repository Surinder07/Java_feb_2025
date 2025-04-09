package april8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(20);
        list.add(1430);
        list.add(1340);
        list.add(110);

        System.out.println("Before sorting : "+list);

        Collections.sort(list);

        System.out.println("After sorting : "+ list);


        List<String> myList = new ArrayList<>();

        myList.add("Yadav");
        myList.add("Niraj");
        myList.add("Nikhil");
        myList.add("Simran");
        myList.add("Tarak");

        Collections.sort(myList);
        System.out.println(myList); // Lexicographical order
        // ASCII values


        Employee e1 = new Employee(104, "Tarak");
        Employee e2 = new Employee(105, "Nikhil");
        Employee e3 = new Employee(103, "Simran");
        Employee e4 = new Employee(101, "Niraj");
        Employee e5 = new Employee(102, "Ankita");

        List<Employee> employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println("Employee LIST before sorting..."+employeeList);

        Collections.sort(employeeList);

        System.out.println("Employee LIST after sorting..."+employeeList);

        /*
        Product

        product id
        Product Name : sort the product based on the name.
        Product description



         */







    }
}
