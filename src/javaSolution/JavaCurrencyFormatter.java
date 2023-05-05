package javaSolution;

import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Create Locale objects for the specific countries
        Locale usLocale = new Locale("en", "US");
        Locale indiaLocale = new Locale("en", "ji");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        // Create NumberFormat objects for the specific Locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);

//        // Get the currency symbols for each locale
//        Currency usd = Currency.getInstance(usLocale);
//        Currency inr = Currency.getInstance(indiaLocale);
//        Currency cny = Currency.getInstance(chinaLocale);
//        Currency eur = Currency.getInstance(franceLocale);

        // Print the formatted currency values
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
