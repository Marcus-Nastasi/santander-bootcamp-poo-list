package com.santander.list.Ordenation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People implements Comparable<People> {

    private final String name;
    private final String cpf;
    private final Date bornAt;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public People(String name, String cpf, String bornAt) throws ParseException {
        this.name = name;
        this.cpf = cpf;
        this.bornAt = sdf.parse(bornAt);
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getBornAt() {
        return bornAt;
    }

    @Override
    public String toString() {
        return(
            "People{" + "name='" + name + '\'' +
            ", cpf='" + cpf + '\'' +
            ", bornAt=" + sdf.format(bornAt) + '}'
        );
    }

    @Override
    public int compareTo(People p) {
        return this.bornAt.compareTo(p.getBornAt());
    }
}


