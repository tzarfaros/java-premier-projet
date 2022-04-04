package org.humanbboster.myproject.menu;

public enum Drink {

    BEER(5),
    WATER(2),
    COKE(3);

    private int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drink{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
