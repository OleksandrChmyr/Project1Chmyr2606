package Hometask9;

import java.util.Objects;

public final class Laptop extends PortableDevices {
    private String laptopClass;
    private String processorType;
    private int ssdStorageSpace;

    public Laptop() {
    }

    public Laptop(String manufacturer, String modelName, boolean displayExists, int displaySize, int displayResolution,
                  boolean keyboardExists, String laptopClass, String processorType, int ssdStorageSpace) {
        super(manufacturer, modelName, displayExists, displaySize, displayResolution, keyboardExists);
        this.laptopClass = laptopClass;
        this.processorType = processorType;
        this.ssdStorageSpace = ssdStorageSpace;
    }

    public String getLaptopClass() {
        return laptopClass;
    }

    public void setLaptopClass(String laptopClass) {
        this.laptopClass = laptopClass;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getSsdStorageSpace() {
        return ssdStorageSpace;
    }

    public void setSsdStorageSpace(int ssdStorageSpace) {
        this.ssdStorageSpace = ssdStorageSpace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return ssdStorageSpace == laptop.ssdStorageSpace &&
                Objects.equals(laptopClass, laptop.laptopClass) &&
                Objects.equals(processorType, laptop.processorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), laptopClass, processorType, ssdStorageSpace);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopClass='" + laptopClass + '\'' +
                ", processorType='" + processorType + '\'' +
                ", ssdStorageSpace=" + ssdStorageSpace +
                '}';
    }

    public void writeJava () {
        System.out.println("You can write Java code with your laptop");
    }



    @Override
    public void bootSetup() {
        System.out.println("Boot windows 10");

    }

    @Override
    public void startUpMenu() {
        System.out.println("Open desktop screen");

    }

    @Override
    public void startApp() {
        System.out.println("Open Google Chrome browser and search StackOverflow");

    }

    @Override
    public void closeApp() {
        System.out.println("Close Google Ghrome browser");

    }
}
