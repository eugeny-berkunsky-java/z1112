package main;


import books.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Pushkin","Skazki", 100, BookType.CHILD));
        books.add(new Book("Gamma","GoF", 100, BookType.NEW));
        books.add(new Book("Eckel","Java", 200, BookType.REGULAR));

        for (Book book : books) {
            System.out.println(book.daysForReturn());
        }

        books.get(1).setType(BookType.NEW);
        System.out.println("=============");
        for (Book book : books) {
            System.out.println(book.daysForReturn());
        }
    }

    private void run1() {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
//        s.add(1, 7);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
