package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter positive decimal number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
