package com.santander.list.Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private final String author;
    private final String name;
    private final String publisher;
    private final Date publicationDate;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Book(String author, String name, String publisher, String publicationDate) throws ParseException {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.publicationDate = sdf.parse(publicationDate);
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return(
            "Book{" + "author='" + author + '\'' +
            ", name='" + name + '\'' +
            ", publisher='" + publisher + '\'' +
            ", publicationDate=" + sdf.format(publicationDate) + '}'
        );
    }
}

