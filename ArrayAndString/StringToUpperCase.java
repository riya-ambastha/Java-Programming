package ArrayAndString;

import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("Uppercase string: " + upperStr);
    }
}
