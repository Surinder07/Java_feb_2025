package mar4;

public class StringMethodDemo {
    public static void main(String[] args) {

        String s1 = "pragra";

        System.out.println(s1.length());  // lenth - property in array

        System.out.println(s1.toUpperCase());
        char[] chars = s1.toCharArray();


        char c = s1.charAt(1);
        System.out.println(c);

        System.out.println(s1.trim());

        System.out.println(s1.substring(2));

        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html


        // String name = "Pragra";
        // reverse this String

    }
}
