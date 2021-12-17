package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNTENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        int countEngineMethod;
        if (this.name.equals("A380")) {
            countEngineMethod = 4;
            System.out.println("Количество двигателей равно: " + countEngineMethod);
        } else {
            System.out.println("Количество двигателей равно: " + COUNTENGINE);
        }
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
