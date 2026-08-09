//Q)Given input lines containing a string and an integer, write a Java program using System.out.printf to print two columns:

// The string should be left‑justified in exactly 15 characters.

// The integer should be printed in exactly 3 digits, padded with leading zeroes if necessary.

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);// Here I am trying to format the output.

        }
        System.out.println("================================");

    }
}
