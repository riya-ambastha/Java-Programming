package ArrayAndString;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 10};
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}

