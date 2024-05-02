package com.santander.list.Ordenation;

import java.util.Date;

public class People {

    private String name;
    private String cpf;
    private Date bornAt;

    public People(String name, String cpf, Date bornAt) {
        this.name = name;
        this.cpf = cpf;
        this.bornAt = bornAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBornAt() {
        return bornAt;
    }

    public void setBornAt(Date bornAt) {
        this.bornAt = bornAt;
    }

    @Override
    public String toString() {
        return(
            "People{" + "name='" + name + '\'' +
            ", cpf='" + cpf + '\'' +
            ", bornAt=" + bornAt + '}'
        );
    }
}


