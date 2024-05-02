package com.santander.list;

import com.santander.list.Library.Book;
import com.santander.list.Library.BooksCollection;
import com.santander.list.OpBasics.Task;
import com.santander.list.OpBasics.TaskList;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("test program");
        Task t2 = new Task("other task");
        Task t3 = new Task("third one");

        TaskList taskList = new TaskList();

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        taskList.getAllTasks();
        System.out.println(taskList.totalTasks());
        taskList.removeTask(t2);
        taskList.getAllTasks();
        System.out.println(taskList.totalTasks());

        System.out.println("------ Book --------");

        try {
            Book book = new Book("J. J. Wizard", "Wonderful world", "Jasmin", "12/12/2010");
            Book book2 = new Book("A. A. Abraham", "Wonderful life", "Jasmin", "20/10/2009");

            BooksCollection booksCollection = new BooksCollection();
            booksCollection.addBook(book);
            booksCollection.addBook(book2);

            booksCollection.getAllBooks();

            booksCollection.searchByAuthor("J. J. Wizard");

            System.out.println("----- books by years ------");

            booksCollection.searchByYearsInterval("01/01/2009", "11/12/2010");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}

