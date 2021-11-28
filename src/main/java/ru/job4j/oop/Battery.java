package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryLow = new Battery(10);
        Battery batteryHigh = new Battery(40);
        batteryHigh.exchange(batteryLow);
        System.out.println(batteryHigh.load);
        System.out.println("---------------------------");
        System.out.println(batteryLow.load);
    }
}
