package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive decimal number between 1 and 12: ");
        int num1 = scanner.nextInt();
        int sum = 0;
        if (num1 > 0 && num1 < 13) {
            for (int i = 0; i < 12; i++) {
                sum = sum+ num1;
                System.out.print(sum + "; ");
            }
        } else if (num1 <= 0) {
            System.out.println("This number is too small!");
        } else {
            System.out.println("This number is too big!");
        }
        System.out.println("\n");
        countdown(sum);
        System.out.println("\n");
    }

    static void countdown(int sum) {
        int[] num = new int[12];
        int n = sum / num.length;
        for (int i = 0; i < num.length; i++) {
            System.out.print(sum + "; ");
            sum -= n;
        }
    }
}
