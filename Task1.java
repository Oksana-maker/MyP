package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        int num = scanner.nextInt();
        char ch = 'I';
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print(ch);
            }
        } else {
            System.out.println("This is no positive decimal number");
        }
        System.out.println("\n");


        System.out.println("Enter I: ");
        String st = scanner1.nextLine();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            count++;
        }
        System.out.println(count);
        System.out.println("\n");
    }
}
