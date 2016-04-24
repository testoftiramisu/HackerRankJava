package ThirtyDaysOfCode.Day13.AbstractClasses;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}
