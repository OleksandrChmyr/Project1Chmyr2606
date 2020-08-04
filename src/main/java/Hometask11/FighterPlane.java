package Hometask11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FighterPlane extends Plane{

    public FighterPlane() {
    }

    public FighterPlane(ArrayList<String> aircraftArrayList, HashSet<String> aircraftHashSet, HashMap<String, Integer> aircraftHashMap) {
        super(aircraftArrayList, aircraftHashSet, aircraftHashMap);
    }

    @Override
    public String toString() {
        return "FighterPlane{}";
    }
}
