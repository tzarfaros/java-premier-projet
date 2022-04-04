package org.humanbboster.myproject.ordi;

public class Printer {

    private int id;
    private static int count = 0;
    private String model;

    public Printer(String model) {
        this.id = ++count;
        this.model = model;

    }

    public void print(){
        System.out.println(model + "(" + id + ")");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
