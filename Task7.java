package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello dear user, I can read your mind You think of a number" +
                " between 1 and 100...\nI will guess it!");
        int x = 0;
        int y = 100;
        Thread.sleep(2000);
        String[] state = {"<", ">", "="};

        System.out.println("Yor answer (< = >)");
        int number = y / 2;
        a:
        do {
            System.out.println(number);
            String answer = scanner1.nextLine();

            if (answer.equals(state[0])) {
                System.out.println("Too small");
                x = number;
                number = (y + x) / 2;
            }
            if (answer.equals(state[1])) {
                System.out.println("Too big");
                y = number;
                number = (y + x) / 2;
            } else if (answer.equals(state[2])) {
                System.out.println("Bingo!");
                break a;
            }
        } while (true);
    }
}
