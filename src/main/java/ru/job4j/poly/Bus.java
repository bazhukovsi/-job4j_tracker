package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int colPassengers) {
        System.out.println("В автобусе едут " + colPassengers + " пассажиров.");
    }

    @Override
    public double refuel(double fuel) {
        double litr = 10.0;
        return fuel / litr;
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по дорогам и перевозит пассажиров.");
    }
}
