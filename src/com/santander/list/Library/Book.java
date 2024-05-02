package com.santander.list.Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private String author;
    private String name;
    private String publisher;
    private Date publicationDate;
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
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

