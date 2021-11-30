package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String speciality;

    public Surgeon(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public void makeOperation(Pacient pacient) {
    }
}
