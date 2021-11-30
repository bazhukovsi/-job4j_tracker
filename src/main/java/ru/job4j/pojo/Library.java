package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 20);
        Book book2 = new Book("Clean code", 30);
        Book book3 = new Book("Clean code", 40);
        Book book4 = new Book("Clean code", 50);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        System.out.println("=============================");
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getCount());
        }
        System.out.println("=============================");
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getCount());
            }
        }
    }
}
