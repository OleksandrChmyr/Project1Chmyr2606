package Hometask11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Aircraft {

    private ArrayList<String> aircraftArrayList;
    private HashSet<String> aircraftHashSet;
    private HashMap<String, Integer> aircraftHashMap;

    public Aircraft() {
    }

    public Aircraft(ArrayList<String> aircraftArrayList, HashSet<String> aircraftHashSet, HashMap<String, Integer> aircraftHashMap) {
        this.aircraftArrayList = aircraftArrayList;
        this.aircraftHashSet = aircraftHashSet;
        this.aircraftHashMap = aircraftHashMap;
    }

    public ArrayList<String> getAircraftArrayList() {
        return aircraftArrayList;
    }

    public void setAircraftArrayList(ArrayList<String> aircraftArrayList) {
        this.aircraftArrayList = aircraftArrayList;
    }

    public HashSet<String> getAircraftHashSet() {
        return aircraftHashSet;
    }

    public void setAircraftHashSet(HashSet<String> aircraftHashSet) {
        this.aircraftHashSet = aircraftHashSet;
    }

    public HashMap<String, Integer> getAircraftHashMap() {
        return aircraftHashMap;
    }

    public void setAircraftHashMap(HashMap<String, Integer> aircraftHashMap) {
        this.aircraftHashMap = aircraftHashMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(aircraftArrayList, aircraft.aircraftArrayList) &&
                Objects.equals(aircraftHashSet, aircraft.aircraftHashSet) &&
                Objects.equals(aircraftHashMap, aircraft.aircraftHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircraftArrayList, aircraftHashSet, aircraftHashMap);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftArrayList=" + aircraftArrayList +
                ", aircraftHashSet=" + aircraftHashSet +
                ", aircraftHashMap=" + aircraftHashMap +
                '}';
    }
}
