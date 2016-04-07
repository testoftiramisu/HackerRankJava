package Java.ObjectOrientedProgramming.javaInterface;

import java.util.Scanner;

interface AdvancedArithmetic {
    public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}


public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] argh) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        int n = scanner.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

