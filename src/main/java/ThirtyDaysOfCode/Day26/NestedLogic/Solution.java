package ThirtyDaysOfCode.Day26.NestedLogic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        String actualInput = scanner.nextLine();
        String expectedInput = scanner.nextLine();
        Calendar actual = Calendar.getInstance();
        Calendar expected = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        int returnFee = 0;

        actual.setTime(dateFormat.parse(actualInput));
        expected.setTime(dateFormat.parse(expectedInput));

        int dayFee = (actual.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH)) * 15;
        int monthFee = (actual.get(Calendar.MONTH) - expected.get(Calendar.MONTH)) * 500;
        int yearFee = (actual.get(Calendar.YEAR) - expected.get(Calendar.YEAR)) * 10000;

        if (yearFee > 0) {
            returnFee = 10000;
        } else if (monthFee > 0) {
            returnFee = monthFee;
        } else if (dayFee > 0) {
            returnFee = dayFee;
        }

        if (dayFee + monthFee + yearFee < 0) {
            returnFee = 0;
        }

        System.out.println(returnFee);
    }

}
