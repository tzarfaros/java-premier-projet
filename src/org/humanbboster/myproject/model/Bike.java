package org.humanbboster.myproject.model;

public class Bike {

    public String model;
    public String color;
    public int size;
    public int price;

    public Bike(String model) {
        this.model = model;
        System.out.println("Appel du constructeur par défaut.");
    }

    public Bike(String model, int size) {
        this(model);
        this.size = size;
    }

    public void display() {
        System.out.println("Le vélo " + this.model + " " + this.color + " " + this.size);
    }

    public void comparePrice(Bike bike) {
        if (this.price > bike.price) {
            System.out.println("Le vélo " + this.model + " est plus cher que " + bike.model);
        } else {
            System.out.println("Le vélo " + bike.model + " est plus cher que " + this.model);
        }
    }
}
