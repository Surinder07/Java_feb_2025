package mar4;

public class Test {
    public static void main(String[] args) {

        // 2 x 3 array          or 3 x 2 array

        int[][] arr = new int[3][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        for (int[] element : arr) {
            for (int numbers: element) {
                System.out.println(numbers);
            }
        }


        System.out.println();



/*

        System.out.println(arr[1][1]);
        // loops - nested loop
        // for each


        int[] myArray = {10,20,30,40,50};

        // for every integer element in given array print that element
        for (int x: myArray) {
            System.out.println(x);
        }
*/


        /*

            for(datatype variable : array){
            sout (variable);
            }




         */





    }
}
