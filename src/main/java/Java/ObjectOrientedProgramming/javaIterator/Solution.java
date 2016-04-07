package Java.ObjectOrientedProgramming.javaIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    // Iterator skipping all Integers in the array
    static Iterator func(ArrayList myList) {
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] argh) {
        ArrayList<Object> myList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            myList.add(scanner.nextInt());
        }
        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(scanner.next());
        }

        Iterator it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}