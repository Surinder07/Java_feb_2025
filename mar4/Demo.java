package mar4;

public class Demo {
    public static void main(String[] args) {

        String name = "Pragra";   // save memory
        String company = "Pragra";
        String myCompany = "Pragra";

        name = "microsoft";

        String s = new String("Pragra");

        System.out.println(name.equals(s));  // checks the content
        System.out.println(name == s); // check the ref


        int x = 10;
        x = 23;

        String s5 = "sometghibng";   // Garbage collector will delete this object later

        s5 = "else";


        String s1 = "pragra";
        System.out.println(s1);
        s1 = "microsoft";

        System.out.println(s1);


    }
}




