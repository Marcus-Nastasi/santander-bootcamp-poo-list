package com.santander.list.OpBasics;

import java.util.ArrayList;

public class TaskList {

    Task task;
    ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(String description) {
        Task t = new Task(description);
        tasks.add(t);
    }
}


