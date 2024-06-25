package ArrayAndString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAnArray {

        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 1, 3};

             Arrays.sort(arr);

            System.out.println("Sorted array: ");
            for (int i : arr) {
                System.out.println(i);
            }
        }
}
