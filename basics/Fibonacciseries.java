package basics;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 3; i <= terms; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
