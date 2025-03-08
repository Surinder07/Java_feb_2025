package mar8.inheritancedemo;

public class Main {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.showMobileSpecifications();

        // Child class
        // with the help of child class, you can acces Parent class methods or reuse it.

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.brand = "Iphone";

        smartPhone.capacity = 256;
        smartPhone.color ="Blue";
        smartPhone.showMobileSpecifications();
    }
}
/*

   Computer - Parent class
    |
  Laptop    -
    |
  Tablets

  3 objects
  Computer
  Laptop
  Tablet



 */