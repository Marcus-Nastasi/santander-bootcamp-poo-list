package com.santander.list.OpBasics;

import java.util.ArrayList;

public class TaskList {

    ArrayList<Task> tasks = new ArrayList<>();

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public TaskList() {}

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
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


