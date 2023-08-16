package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive decimal number: ");
        int n = scanner.nextInt();
        int[] binaryNum = new int[32];
        int k = 0;
        if (n > 0) {
            while (n > 0) {
                binaryNum[k] = n % 2;
                n = n / 2;
                k++;
            }

            for (int j = k - 1; j >= 0; j--) {
                System.out.print(binaryNum[j]);
            }
        } else System.out.println("This is no positive decimal number");
        System.out.println("\n");

        System.out.println("Enter positive decimal number: ");
        Scanner scanner1 = new Scanner(System.in);
        String base = scanner1.nextLine();
        char[] chars = base.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = base.length() - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += mult;
            }
            mult *= 2;
        }
        System.out.println(result);
    }
}
