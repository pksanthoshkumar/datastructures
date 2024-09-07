package org.opendesk.gof.singleton.factorymethod;

public class Car implements Vehicle {
    private String plateNumber;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void stop() {
        System.out.println("Car with plate number " + plateNumber + " has stopped.");
    }

    @Override
    public void move() {
        System.out.println("Car with plate number " + plateNumber + " is moving.");
    }
}

