package ArrayAndString;

import java.util.Scanner;

public class StringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String lowerStr = str.toLowerCase();

        System.out.println("Lowercase string: " + lowerStr);
    }

}
