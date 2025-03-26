package mar25.innerclassdemo;

public class OuterClass {

    int x = 10;

    public void set(){
        System.out.println("Outerclass set Method");

        class Demo {

        }
    }

    class InnerClassDemo {

        public void show(){
            System.out.println("Inner class show method");
        }

    }
}


