package basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + max);
                break;
            }
            max++;
        }
    }

}
