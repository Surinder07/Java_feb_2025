package mar25.innerclassdemo.staticclass;

public class Computer {
    public static void test(){

        System.out.println("Inside test method..");
    }
    static class MotherBoard{
        void makeCalculations(){
            System.out.println("Inside make calculations method..");
        }

    }
}

