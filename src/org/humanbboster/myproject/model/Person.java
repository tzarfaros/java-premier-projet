package org.humanbboster.myproject.model;

public class Person {

    public String name;
    public int age;
    public Horse horse;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Nom de la personne : " + this.name + " d'age " + this.age + " ans.");
    }

    public void addToAge(int age) {
            this.age += age;
            System.out.println(this.age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
