package Hometask9;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n --- Vehicles Class --- \n");//Абстрактные классы нельзя вызвать
        Bus bus = new Bus("GMC","Citybus","DieselEngine",
                450,15,2,45,"Transport",false);
        System.out.println(bus);
        bus.turnKey();
        bus.ignitionStart();
        bus.moveGearShifter();
        bus.pushClutchPedal();
        bus.hornSound();
        bus.pressHornButton();
        bus.busStop();
        System.out.println(" ");

        Truck truck = new Truck("Ford","Freightliner","Diesel",
                300,5,2,"Container",40,true);
        System.out.println(truck);
        truck.turnKey();
        truck.ignitionStart();
        truck.moveGearShifter();
        truck.pushClutchPedal();
        truck.hornSound();
        truck.pressHornButton();
        truck.cargoDeliver();
        System.out.println(" ");

        OffroadCar offroadCar = new OffroadCar("Land Rover","Deffender 110","Gas",
                800,4,2,32,"Mud",true);

        System.out.println(offroadCar);
        offroadCar.turnKey();
        offroadCar.ignitionStart();
        offroadCar.moveGearShifter();
        offroadCar.pushClutchPedal();
        offroadCar.hornSound();
        offroadCar.pressHornButton();
        offroadCar.offRoad();
        System.out.println(" ");

        System.out.println("\n --- Devices Class --- \n");//Абстрактные классы нельзя вызвать

        Laptop laptop = new Laptop("Lenovo","Ideapad",true,15,
                1080,true,"Business","Intel",512);
        System.out.println(laptop);
        laptop.writeJava();
        laptop.bootSetup();
        laptop.startUpMenu();
        laptop.startApp();
        laptop.closeApp();
        System.out.println(" ");

        Tablet tablet = new Tablet("Xiaomi","MiPad4",true,10,
                1080,false,4500,"Grey",false);
        System.out.println(tablet);
        tablet.watchVideo();
        tablet.bootSetup();
        tablet.startUpMenu();
        tablet.startApp();
        tablet.closeApp();
        System.out.println(" ");

        Smartphone smartphone = new Smartphone("iPhone","11",true,6,
                2400,false,"iOs11",64,true);
        System.out.println(smartphone);
        smartphone.call();
        smartphone.bootSetup();
        smartphone.startUpMenu();
        smartphone.startApp();
        smartphone.closeApp();
        System.out.println(" ");

    }
}
