package mar1.demo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of array");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Print the elements of array ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
