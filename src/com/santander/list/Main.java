package com.santander.list;

import com.santander.list.Library.Book;
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
            Book book = new Book(
                "J. J. Wizard", "Wonderful world", "Jasmin", "12/12/2010"
            );
            System.out.println(book);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}

