package Java.ObjectOrientedProgramming.javaAbstractClass;

import java.util.*;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }

}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String title = scanner.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());

    }
}

