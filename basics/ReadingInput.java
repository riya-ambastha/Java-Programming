package basics;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);
    }
    }
