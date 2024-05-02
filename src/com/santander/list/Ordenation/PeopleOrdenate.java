package com.santander.list.Ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrdenate {

    private final List<People> peopleList = new ArrayList<>();

    public PeopleOrdenate() {}

    public void addPeople(People people) {
        peopleList.add(people);
    }

    public void getAll() {
        for(People p: this.peopleList) System.out.println(p);
    }

    public List<People> ordenateByAge() {
        List<People> peopleList1 = new ArrayList<>(this.peopleList);
        Collections.sort(peopleList1);
        return peopleList1;
    }
}

