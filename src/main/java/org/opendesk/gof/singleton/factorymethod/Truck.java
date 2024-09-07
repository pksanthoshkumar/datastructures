package org.opendesk.gof.singleton.factorymethod;

public class Truck implements Vehicle {
    private String plateNumber;

    public Truck(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void stop() {
        System.out.println("Truck with plate number " + plateNumber + " has stopped.");
    }

    @Override
    public void move() {
        System.out.println("Truck with plate number " + plateNumber + " is moving.");
    }
}

