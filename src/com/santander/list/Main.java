package com.santander.list;

import com.santander.list.OpBasics.Task;
import com.santander.list.OpBasics.TaskList;

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
    }
}

