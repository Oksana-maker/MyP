package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I am calculating the GCD. Please enter :");
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int i = 0;
        if (firstNumber < secondNumber) {
            i = firstNumber;
            firstNumber = secondNumber;
            secondNumber = i;
        }
        int count = Math.min(firstNumber, secondNumber);
        if (firstNumber > 0 && secondNumber > 0) {
            for (int n = count; n >= 1; n--) {
                if (firstNumber % n == 0 && secondNumber % n == 0) {
                    count = n;
                    break;
                }
            }
            System.out.println(count);
        } else {
            System.out.println("One of the numbers is 0");
        }
    }
}
