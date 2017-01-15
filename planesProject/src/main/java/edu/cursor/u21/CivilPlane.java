package edu.cursor.u21;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CivilPlane extends Plane {
    private int passengerCapacity;
    private int passengers;

    public CivilPlane() {
    }

    public CivilPlane(String name, String type, int weight, double fuelCapacity, int passengerCapacity) {
        super(name, type, weight, fuelCapacity);
        this.passengerCapacity = passengerCapacity;
    }
}
