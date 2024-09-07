package org.opendesk.gof.singleton.factorymethod;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType, String plateNumber) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car(plateNumber);
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck(plateNumber);
        }
        return null;
    }
}

