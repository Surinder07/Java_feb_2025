package mar15.comp;

public class EmployeeMain {
    public static void main(String[] args) {


        Address address2 = new Address("225 King street", "Mississauga", "Ontario", "Canada", "A1B 2S4");
        Address address3 = new Address("225 King street", "Brampton", "Ontario", "Canada", "A1B 2S4");
        Address address4 = new Address("225 King street", "Caledon", "Ontario", "Canada", "A1B 2S4");
        Address address5 = new Address("225 King street", "Scarborough", "Ontario", "Canada", "A1B 2S4");

        Employee employee1 = new Employee(101, "Yadav", "yadav@gmail.com",
                                new Address("225 King street", "Toronto", "Ontario", "Canada", "A1B 2S4"),
                                 200000.00);



        Employee employee2 = new Employee(102, "Niraj", "niraj@gmail.com",address2, 190000.10);
        Employee employee3 = new Employee(103, "Niraj", "niraj@gmail.com",address3, 190000.10);
        Employee employee4 = new Employee(104, "Niraj", "niraj@gmail.com",address4, 190000.10);
        Employee employee5 = new Employee(105, "Niraj", "niraj@gmail.com",address5, 190000.10);

        System.out.println("City of employee 2 is : "+employee2.getAddress().getCity());

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);


    }
}
