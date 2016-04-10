package ThirtyDaysOfCode.Day2.Operators;

import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double mealCost = scanner.nextDouble(); // original meal price
        int tipPercent = scanner.nextInt(); // tip percentage
        int taxPercent = scanner.nextInt(); // tax percentage
        scanner.close();

        double tips = (mealCost / 100) * tipPercent;
        double tax = (mealCost / 100) * taxPercent;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tips + tax);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}

