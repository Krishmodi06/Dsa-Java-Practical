package dsa_task;

import java.util.Vector;

public class p7 {
    public static void main(String[] args) {
        Vector<String> books = new Vector<>();
        books.add("Java Programming");
        books.add("Python Programming");
        books.add("C++ Programming");

        books.addFirst("JavaScript Programming");

        System.out.println("Books in the vector:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
