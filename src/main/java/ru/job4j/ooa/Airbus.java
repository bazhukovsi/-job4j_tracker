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
        int countEngineMethod = "A380".equals(this.name) ? 4 : COUNTENGINE;
        System.out.println("Количество двигателей равно: " + countEngineMethod);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
