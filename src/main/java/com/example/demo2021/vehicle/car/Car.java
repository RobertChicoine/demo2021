package com.example.demo2021.vehicle.car;

import com.example.demo2021.vehicle.Vehicle;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private String model;
    private  String engine;
    private String colour;

    public Car(String name, int doors, int wheels, String model, String engine, String colour) {
        super(name);
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Hello!!!";
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
