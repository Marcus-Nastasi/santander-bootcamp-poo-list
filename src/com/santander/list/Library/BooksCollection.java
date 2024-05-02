package com.santander.list.Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BooksCollection {

    private final List<Book> bookList = new ArrayList<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public BooksCollection() {}

    public void getAllBooks() {
        for(Book b: bookList) System.out.println(b);
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    public void searchByAuthor(String author) {
        List<Book> authors = new ArrayList<>();

        for(Book b: this.bookList) if(b.getAuthor().equals(author)) authors.add(b);

        if(authors.isEmpty()) System.out.println("No books finded from this author.");
        else for(Book a: authors) System.out.println(a);
    }

    public void searchByTitle(String title) {
        for(Book b: this.bookList) if(b.getName().equals(title)) System.out.println(b);
    }

    public void searchByYearsInterval(String from, String to) throws ParseException {
        Date dInit = sdf.parse(from);
        Date dFinal = sdf.parse(to);

        List<Book> booksByYears = new ArrayList<>();

        for(Book b: this.bookList) {
            if(b.getPublicationDate().after(dInit) && b.getPublicationDate().before(dFinal)) {
                booksByYears.add(b);
            }
        }

        if(booksByYears.isEmpty()) System.out.println("No books on this range.");
        else for(Book b: booksByYears) System.out.println(b);
    }
}

