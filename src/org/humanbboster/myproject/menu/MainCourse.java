package org.humanbboster.myproject.menu;

public enum MainCourse {

    CHICKEN(5),
    BEEF(8),
    SALAD(3);

    private int price;

    MainCourse(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MainCourse{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
