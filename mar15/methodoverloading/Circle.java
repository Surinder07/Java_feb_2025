package mar15.methodoverloading;

public class Circle extends Shape{
    double radius;

    @Override
    double area() {
         return Math.PI * radius * radius;
    }
}
/*


                    Payment [makePayment()]
         |              |           |           |
       CreditCard      PayPal       UPI         Interac


            all should be assigned to Payment



 */