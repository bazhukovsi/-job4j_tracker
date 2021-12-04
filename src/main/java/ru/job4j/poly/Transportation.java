package ru.job4j.poly;

public class Transportation {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        Vehicle bus = new Bus();
        Vehicle airplain = new Airplane();
        Vehicle train = new Train();
        vehicles[0] = bus;
        vehicles[1] = airplain;
        vehicles[2] = train;
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
