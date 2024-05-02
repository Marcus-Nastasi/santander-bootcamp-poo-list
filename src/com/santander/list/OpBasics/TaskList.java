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

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public int totalTasks() {
        return this.tasks.size();
    }

    public void getAllTasks() {
        for(Task d: this.tasks) System.out.println(d.getDescription());
    }
}


