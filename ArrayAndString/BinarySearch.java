package ArrayAndString;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 10};
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
