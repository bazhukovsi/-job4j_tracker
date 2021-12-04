package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int colPassengers) {

    }

    @Override
    public double refuel(double fuel) {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по дорогам и перевозит пассажиров.");
    }
}
