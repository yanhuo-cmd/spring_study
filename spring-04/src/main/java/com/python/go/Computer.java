package com.python.go;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {

    private Amd amd;

    private Inter inter;

    public Amd getAmd() {
        return amd;
    }


    public void setAmd(Amd amd) {
        this.amd = amd;
    }

    public Inter getInter() {
        return inter;
    }


    public void setInter(Inter inter) {
        this.inter = inter;
    }

    public String getComputer_name() {
        return computer_name;
    }


    public void setComputer_name(String computer_name) {
        this.computer_name = computer_name;
    }

    private String computer_name;

    @Autowired
    public Computer(Amd amd, Inter inter) {
        this.amd = amd;
        this.inter = inter;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "amd=" + amd +
                ", inter=" + inter +
                ", computer_name='" + computer_name + '\'' +
                '}';
    }
}
