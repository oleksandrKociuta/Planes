package edu.cursor.u21;

import java.util.ArrayList;

public interface CivilPlaneOptions {
    public void prepareCivilPlane(ArrayList<CivilPlane> civilPlane, int planePosition);

    public void startCivilMission(ArrayList<CivilPlane> civilPlane, int planePosition);

    public void loadPassengers(ArrayList<CivilPlane> civilPlane, int planePosition);
}
