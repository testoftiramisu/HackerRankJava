package Java.ExceptionHandling.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static int getResult(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = getResult(a, b);
            System.out.println(result);
        } catch (InputMismatchException ime) {
            System.out.println(ime.getClass().getName());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getClass().getName() + ": " + ae.getMessage());
        }
    }
}
