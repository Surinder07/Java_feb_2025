package mar25.innerclassdemo;

public class Main {
    public static void main(String[] args) {

        // 1. Object for outerclass is required.
        OuterClass outerClass = new OuterClass();
        outerClass.set();

        // with the reference of outerclass.new create inner class object
        // inner class object
        OuterClass.InnerClassDemo innerClassObject = outerClass.new InnerClassDemo();
        innerClassObject.show();

    }
}
