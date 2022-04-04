package org.humanbboster.myproject.voiture;

import org.humanbboster.myproject.model.Car;

import java.util.ArrayList;

public class Parking {

    private String name;
    private String city;
    private String address;
    private ArrayList<Voiture> cars;

    public Parking(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public int countByBrand(String brand) {
        int carTotal =this.getCars().size();
        return carTotal;
    }

    public void add(Voiture c) {
        this.getCars().add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Voiture> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Voiture> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parking{");
        sb.append("name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
