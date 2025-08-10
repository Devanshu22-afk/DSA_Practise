package Interfaces;

public class Vehicle implements Car,Bike{

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void Stop() {
        System.out.println("Car is Stopping");

    }
}
