package eOlymp;

import java.util.Scanner;

public class Sademesele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 10 && a <= 99) {
            int tensDigit = a / 10;

            // Extract the ones digit
            int onesDigit = a % 10;

            // Output the digits
            System.out.print(tensDigit + " " + onesDigit);

        }
    }

}
