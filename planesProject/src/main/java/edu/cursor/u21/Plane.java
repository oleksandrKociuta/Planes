package edu.cursor.u21;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode(exclude = {"weight", "fuel", "fuelCapacity"})
public class Plane {
    private String name;
    private String type;
    private int weight;
    private double fuel;
    private double fuelCapacity;

    public Plane(String name, String type, int weight, double fuelCapacity){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
    }

    public Plane() {
    }
}

