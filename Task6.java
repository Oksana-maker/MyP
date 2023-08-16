package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello dear user, I know a secret number between 0 and 100." +
                " Can you guess it?");
        int secretNumber = random.nextInt(0, 101);
        int number = -1;
        int count = 0;
        do {
            System.out.println("Enter yor number: ");
            number = scanner.nextInt();
            if (number > secretNumber) {
                System.out.println("This number is too high ");
                count++;
            } else if (number < secretNumber) {
                System.out.println("This number is too small");
                count++;
            } else {
                count++;
                System.out.println("Great! You guessed " + count + " until you found it");
            }

        } while (number != secretNumber);
    }
}
