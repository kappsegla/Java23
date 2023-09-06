package org.example.oop;

public class Garage {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(5, 50, 0.6f);
        Vehicle vehicle2 = new Vehicle(48, 150, 2.4f);

        System.out.println("Vehicle 1 can take " +  vehicle1.getPassengers() + " passengers.");
        System.out.println("And go "+ vehicle1.getMaxRange() + " mil.");
        System.out.println("Vehicle 2 can take " +  vehicle2.getPassengers() + " passengers.");
        System.out.println("And go "+ vehicle2.getMaxRange() + " mil.");

        System.out.printf("Vehicle 1 can take %02d passengers.\n", vehicle1.getPassengers());
        System.out.printf("And go %.2f mil.\n", vehicle1.getMaxRange());

        String formattedText = String.format("Vehicle 1 can take %02d passengers.\n", vehicle1.getPassengers());
        System.out.println(formattedText);


    }

}
