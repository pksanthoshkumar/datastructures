package org.opendesk.gof.singleton.factorymethod;

public class VehicleFactoryDemo {
    public static void main(String[] args) {
        // Get a Car instance
        Vehicle car = VehicleFactory.getVehicle("CAR", "ABC123");
        car.move();
        car.stop();

        // Get a Truck instance
        Vehicle truck = VehicleFactory.getVehicle("TRUCK", "XYZ789");
        truck.move();
        truck.stop();
    }
}
