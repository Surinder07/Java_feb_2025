package mar11;
public class Main {
    public static void main(String[] args) {

        Car car = new Car(); //
        car.display();

        Employee employee  = new Employee(100,"Niraj");
       // employee.setId(1675401);
        System.out.println(employee.getId());
        System.out.println(employee.getName());

    }
}

//