package mar1.staticdemo;

public class ProductMain {
    public static void main(String[] args) {

        // manmeet  ----> person

        // Object
        // stack        --------->                Heap
        // new keyword initialize to give memory to the object
        Product product1 = new Product("Apple Iphone 16 , 128 GB", 1400.12); // 3 units

        Product product2 = new Product("Macbook Air , 128 GB", 1450.50);
        Product product3 = new Product("Apple air tag", 40.50);

        product1.printProductDetails();
        System.out.println();
        product2.printProductDetails();
        System.out.println();
        product3.printProductDetails();
    }
}

// pen - shared among 5 diff people
/*
A  - start 10 units  - 1000 lines
B  -
C
D
E


Employee
id, name , email , Company



 */
