package org.humanbboster.myproject.menu;

public class Order {

    private String ref;
    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Order(String ref, Drink drink, MainCourse mainCourse, Dessert dessert) {
        this.ref = ref;
        this.drink = drink;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public float totalPrice() {
        return dessert.getPrice() + mainCourse.getPrice() + drink.getPrice();
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {

        this.drink = drink;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("ref='").append(ref).append('\'');
        sb.append(", drink=").append(drink);
        sb.append(", mainCourse=").append(mainCourse);
        sb.append(", dessert=").append(dessert);
        sb.append('}');
        return sb.toString();
    }
}
