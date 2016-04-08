package Java.ObjectOrientedProgramming.calculatingVolume;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    public Output getOutput() {
        return output;
    }

    private Output output = new Output();

    public int getIntValue() throws IOException {
        int input = scanner.nextInt();
        if (input <= 0) {
            throw new NumberFormatException();
        }
        return input;
    }

    public double getDoubleValue() throws IOException {
        double input = scanner.nextDouble();
        if (input <= 0) {
            throw new NumberFormatException();
        }
        return input;
    }

    public static Volume getVolume() {
        return new Volume();
    }
}

class Volume {

    public double calculate(int a) {
        return Math.pow(a, 3);
    }

    public double calculate(int l, int b, int h) {
        return l * b * h;
    }

    public double calculate(double r) {
        return (2 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public double calculate(double r, double h) {
        return Math.PI * (r * r) * h;
    }

}

class Output {
    public void display(double volume) {
        System.out.printf("%.3f\n", volume);
    }
}

public class Solution {

    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Calculator calculator = new Calculator();
            int testCases = calculator.getIntValue();
            while (testCases-- > 0) {
                double volume = 0.0d;
                int ch = calculator.getIntValue();
                if (ch == 1) {
                    int a = calculator.getIntValue();
                    volume = Calculator.getVolume().calculate(a);
                } else if (ch == 2) {
                    int l = calculator.getIntValue();
                    int b = calculator.getIntValue();
                    int h = calculator.getIntValue();
                    volume = Calculator.getVolume().calculate(l, b, h);
                } else if (ch == 3) {
                    double r = calculator.getDoubleValue();
                    volume = Calculator.getVolume().calculate(r);
                } else if (ch == 4) {
                    double r = calculator.getDoubleValue();
                    double h = calculator.getDoubleValue();
                    volume = Calculator.getVolume().calculate(r, h);
                }
                calculator.getOutput().display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e + ": All the values must be positive");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

/**
 * This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate



