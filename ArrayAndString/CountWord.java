package ArrayAndString;

import java.util.Scanner;

public class CountWord {
    public class CountWords {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            String[] words = str.trim().split("\\s+");
            int wordCount = words.length;

            System.out.println("Number of words in the string: " + wordCount);
        }
}
