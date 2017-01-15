package edu.cursor.u21;


import java.util.ArrayList;
import java.util.Locale;

public class CivilPlaneMethods implements CivilPlaneOptions, Util {
    @Override
    public void prepareCivilPlane(ArrayList<CivilPlane> civilPlane, int planePosition) {
        System.out.println("Passenger Capacity : " + civilPlane.get(planePosition).getPassengerCapacity());
        loadFuel(civilPlane, planePosition);
        loadPassengers(civilPlane, planePosition);
    }

    @Override
    public void startCivilMission(ArrayList<CivilPlane> civilPlane, int planePosition) {
        System.out.println("Passengers on the board : " + civilPlane.get(planePosition).getPassengers());
        int result = (int) (((double) civilPlane.get(planePosition).getPassengers()
                / civilPlane.get(planePosition).getPassengerCapacity()) * Util.HUNREDPERCENT);
        if (result >= Util.PROFITINDECTIR) {
            System.out.println("Profitability = " + result + "%.");
        } else {
            System.out.println("Profitability is very low  = " + result + "%.");
        }
        System.out.println("Plane is successfully landed!\n");
    }

    @Override
    public void loadPassengers(ArrayList<CivilPlane> civilPlane, int planePosition) {
        civilPlane.get(planePosition)
                .setPassengers((int) (Math.random() * (civilPlane.get(planePosition).getPassengerCapacity() / Util.HALFOFPROPERTIES)
                        + (civilPlane.get(planePosition).getPassengerCapacity() / Util.HALFOFPROPERTIES) + Util.RANDOMCORRECTOR));
    }

    @Override
    public void loadFuel(ArrayList<? extends Plane> plane, int planePosition) {
        plane.get(planePosition).setFuel((Math.random() * (plane.get(planePosition).getFuelCapacity() / Util.HALFOFPROPERTIES)
                + (plane.get(planePosition).getFuelCapacity() / Util.HALFOFPROPERTIES) + Util.RANDOMCORRECTOR));
        System.out.printf(Locale.ENGLISH, "Fuel on the board : %.4f litres.\n", plane.get(planePosition).getFuel());
    }
}
