package mar8;

public class StringDemo1 {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Pragra");
        System.out.println(sb);  // Pragra
        System.out.println(sb.reverse()); // 10 %

        System.out.println(sb.length());

        StringBuffer newSb = sb.append(" Incorporation");

        System.out.println(sb.length()); //

        System.out.println("    -------    ");

       /* String s = "Microsoft";
        System.out.println(s);

        String newObject = s.concat(" Incorporation");

        System.out.println(s);  // Microsoft Incor
        System.out.println(newObject);*/
    }
}




// String vs StringBuilder vs StringBuffer
// Mutuability and immutability


/*

String  - Thread safe
StringBuffer - Thread safe
StringBuffer - Not thread safe


 */







