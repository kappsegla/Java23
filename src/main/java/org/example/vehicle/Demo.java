package org.example.vehicle;

public class Demo {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("ABC123");
        Vehicle vehicle2 = new Car("ABD321");
        Vehicle vehicle3 = new Truck("TTN001");

        checkForMaintance(vehicle1);

//        switch (vehicle1) {
//            case Car car -> System.out.println("Car");
//            case Truck truck-> System.out.println("Truck");
//        }
    }

    public static void checkForMaintance(Maintainable vehicle){
        System.out.println(vehicle.getServiceIntervallInKm());
    }
}
