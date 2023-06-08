package hackerRank;

import java.time.LocalDate;
import java.util.Scanner;

public class javaDateAndTime {


    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println( findDay(month, day, year));

    }
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String weekdays = String.valueOf(date.getDayOfWeek());
        return weekdays;
    }


    private static String weekday(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String weedays = String.valueOf(date.getDayOfWeek());
        return weedays;
    }


}
