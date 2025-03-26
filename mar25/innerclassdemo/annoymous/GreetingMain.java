package mar25.innerclassdemo.annoymous;

public class GreetingMain {
    public static void main(String[] args) {

       /* Greeting greeting = new Hello();
        greeting.greet();*/

         Greeting greeting = new Greeting(){
             @Override
             public void greet() {
                 System.out.println("hello");
             }
         };
         greeting.greet();

         EnglishGreeting englishGreeting = new EnglishGreeting() {
             @Override
             void greet() {
                 System.out.println("Hello...");
             }
         };
         englishGreeting.greet();

         /*
         another class or interface
         with Hindi Greeting
         Spanish Greeting...



          */

    }
}
