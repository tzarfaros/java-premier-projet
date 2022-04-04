package org.humanbboster.myproject.model;

import java.util.Objects;

public class Orc {

    public String name = "NameLess";
    public int health;
    public int force;

    public Orc(int health, int force) {
        if (health <= 100) {
            this.health = health;
        } else {
            this.health = 100;
        }
        this.force = force;
    }

    public Orc(String name, int health, int force) {
        this(health, force);
        this.name = name;
    }

    public void attack(Orc o) {
        o.health -= this.force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orc orc = (Orc) o;
        return name.equals(orc.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orc{");
        sb.append("name='").append(name).append('\'');
        sb.append(", health=").append(health);
        sb.append(", force=").append(force);
        sb.append('}');
        return sb.toString();
    }
}
