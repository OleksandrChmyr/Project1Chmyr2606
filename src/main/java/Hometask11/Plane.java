package Hometask11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Plane extends Aircraft {

    public Plane() {
    }

    public Plane(ArrayList<String> aircraftArrayList, HashSet<String> aircraftHashSet, HashMap<String, Integer> aircraftHashMap) {
        super(aircraftArrayList, aircraftHashSet, aircraftHashMap);
    }

    @Override
    public String toString() {
        return "Plane{}";
    }
}
