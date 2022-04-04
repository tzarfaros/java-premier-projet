package org.humanbboster.myproject.model;

import java.util.Objects;

public class Car {

    private String couleur;
    private String marque;
    private String model;

    public Car(String couleur, String marque, String model) {
        this.couleur = couleur;
        this.marque = marque;
        this.model = model;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(marque, car.marque) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marque, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("couleur='").append(couleur).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
