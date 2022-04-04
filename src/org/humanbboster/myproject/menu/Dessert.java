package org.humanbboster.myproject.menu;

public enum Dessert {

    ICECREAM(3),
    CHOCOSNACK(4);

    private int price;

    Dessert(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dessert{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
