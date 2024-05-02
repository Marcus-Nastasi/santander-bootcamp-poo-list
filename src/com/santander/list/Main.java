package com.santander.list;

import com.santander.list.Library.Book;
import com.santander.list.Library.BooksCollection;
import com.santander.list.OpBasics.Task;
import com.santander.list.OpBasics.TaskList;
import com.santander.list.Ordenation.People;
import com.santander.list.Ordenation.PeopleOrdenate;

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

        System.out.println("---- Tasks -----");
        taskList.getAllTasks();
        System.out.println(taskList.totalTasks());
        taskList.removeTask(t2);
        taskList.getAllTasks();
        System.out.println(taskList.totalTasks());

        System.out.println("\n------ Book --------");

        try {
            Book book = new Book("J. J. Wizard", "Wonderful world", "Jasmin", "12/12/2010");
            Book book2 = new Book("A. A. Abraham", "Wonderful life", "Jasmin", "20/10/2009");

            BooksCollection booksCollection = new BooksCollection();
            booksCollection.addBook(book);
            booksCollection.addBook(book2);
            booksCollection.getAllBooks();
            booksCollection.searchByAuthor("J. J. Wizard");

            System.out.println("\n----- books by years ------");
            booksCollection.searchByYearsInterval("01/01/2009", "11/12/2010");

            System.out.println("\n------ People --------");
            People p1 = new People("Marcus", "12345828", "26/10/2001");
            People p2 = new People("Maria", "232323232", "10/01/2004");
            People p3 = new People("João", "422443423423", "25/04/1995");

            PeopleOrdenate po = new PeopleOrdenate();
            po.addPeople(p1);
            po.addPeople(p2);
            po.addPeople(p3);

            System.out.println("\nDesordered list");
            po.getAll();

            System.out.println("\nOrdered list by age");
            for(People p: po.ordenateByAge()) System.out.println(p);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}

