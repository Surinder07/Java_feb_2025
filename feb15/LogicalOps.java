package feb15;

public class LogicalOps {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int a = 30;
        int b = 20;

        //              10>20  F
        boolean result1 = (x > y ) && (x ==10);   // false
        boolean result2 = (a > y ) || (x <a);   // true
        boolean result3 = (x < y ) && (x > b); // false
        boolean result4 = (x > y ) || (y > a); // false
        boolean resul5 = (a > y ) && ( y == 20); // true
        boolean result6 = (x >=10  ) || (a == b); // true
        boolean result7 = (a > x ) && (x <= 10); // true


        boolean result8 = !((x >=10  ) || (a == b));
        System.out.println(result8);
        boolean result9 = !((a > x ) && (x <= 10));
        System.out.println(result9);












        // Comparison ops
        //   <   >    <=    >=   == !=
        // 10 < 20 - true
        // 20 > 30  - false
        // 20 <= 20  - true
        // 10 != 5   - true





        /*
            AND - &&
            1       2        result
           T         T          T
           T         F          F
           F         T          F
           F        F           F


        OR   ||
        1       2    result
        T       T       T
        T       F       T
        F       T       T
        F       F       F


        NOT - !
        T          F
        F           T




         */





        //    AND,   OR, NOT
        // &&       ||      !

        /*
              a    &&     b    -- true



         */


    }
}
