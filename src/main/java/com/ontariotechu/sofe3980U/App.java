package com.ontariotechu.sofe3980U;

import java.util.Scanner;
import org.joda.time.LocalTime;

/**
 * Interactive demo of the Binary class: add, OR, AND, and multiply.
 * Also prints the current local time using org.joda.time, kept from v2.
 */
public class App {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        Binary a = new Binary(scanner.nextLine().trim());

        System.out.print("Enter the second binary number: ");
        Binary b = new Binary(scanner.nextLine().trim());

        Binary sum = Binary.add(a, b);
        Binary orResult = Binary.or(a, b);
        Binary andResult = Binary.and(a, b);
        Binary product = Binary.multiply(a, b);

        System.out.println();
        System.out.println("A            = " + a.getValue());
        System.out.println("B            = " + b.getValue());
        System.out.println("A + B        = " + sum.getValue());
        System.out.println("A OR B       = " + orResult.getValue());
        System.out.println("A AND B      = " + andResult.getValue());
        System.out.println("A * B        = " + product.getValue());

        scanner.close();
    }
}