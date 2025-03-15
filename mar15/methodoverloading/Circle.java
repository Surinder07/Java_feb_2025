package mar15.methodoverloading;

public class Circle extends Shape{
    double radius;

    @Override
    double area() {
         return Math.PI * radius * radius;
    }
}
/*


                    Payment [makePayment()]     - Parent
         |              |           |           |
       CreditCard      PayPal       UPI         Interac   - Child


            all should be assigned to Payment


take break 15-20 mins. Discuss the solution after
 */