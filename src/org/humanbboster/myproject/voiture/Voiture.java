package org.humanbboster.myproject.voiture;

import org.humanbboster.myproject.model.Car;

public class Voiture {

    private int speed = 0;
    private int maxSpeed = 220;
    private OwnerInfo owner;
    private final CarInfo carInfo;

    public Voiture(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    public Voiture(int speed, CarInfo carInfo) {
        this(carInfo);
        this.setSpeed(speed);
    }

    public Voiture(int speed, String serialNumber, String brand) {
        this.setSpeed(speed);
        this.carInfo =  new CarInfo(serialNumber, brand);
    }

    public String compare(Voiture v1, Voiture v2) {
        String comparator = "";
        if (v1.speed < v2.speed) {
            comparator = "less";
        } else if (v1.speed > v2.speed){
            comparator = "more";
        } else {
            comparator = "at the same";
        }
        return "The car " + v1.carInfo.getSerialNumber() + " is going " + v1.speed + " km/h " + comparator + " then the car " + v2.carInfo.getSerialNumber();
    }

    public static String compare(Voiture v1) {
        return Voiture.compare(v1);
    }


    public void accelerate(int speed) {
        this.speed = (this.speed + speed);
        System.out.println("Accélération de " + speed);
    }

    public void decelerate(int speed) {
        this.speed = (Math.max(0, this.speed - Math.abs(speed)));
        System.out.println("Ralentissement de " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.min(speed, this.maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public OwnerInfo getOwner() {
        return owner;
    }

    public void setOwner(OwnerInfo owner) {
        this.owner = owner;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voiture{");
        sb.append("speed=").append(speed);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", owner=").append(owner);
        sb.append(", carInfo=").append(carInfo);
        sb.append('}');
        return sb.toString();
    }
}
