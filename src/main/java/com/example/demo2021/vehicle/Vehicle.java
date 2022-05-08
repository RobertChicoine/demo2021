package com.example.demo2021.vehicle;

public class Vehicle implements IVehicle{
    private String name;
    private boolean isMoving;

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public boolean isMoving() {
        return isMoving;
    }

    @Override
    public void engagePower() {
        System.out.println("Power is here!!!");
    }
}
