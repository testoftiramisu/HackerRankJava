package Algorithms.Implementation.LibraryFine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException{
        String actualInput = scanner.nextLine();
        String expectedInput = scanner.nextLine();
        int fee = 0;

        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        Calendar actual = Calendar.getInstance();
        Calendar expected = new GregorianCalendar();

        actual.setTime(df.parse(actualInput));
        expected.setTime(df.parse(expectedInput));

        int dayFee = (actual.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH)) * 15;
        int monthFee = (actual.get(Calendar.MONTH) - expected.get(Calendar.MONTH)) * 500;
        int yearFee = (actual.get(Calendar.YEAR) - expected.get(Calendar.YEAR)) * 10000;

        if (yearFee > 0) {
            fee = 10000;
        } else if (monthFee > 0) {
            fee = monthFee;
        } else if (dayFee > 0) {
            fee = dayFee;
        }
        
        if (dayFee + monthFee + yearFee < 0) {
            fee = 0;
        }

        System.out.println(fee);
    }
}
