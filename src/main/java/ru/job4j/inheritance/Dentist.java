package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String speciality;

    public Dentist(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public void putSeal(Pacient pacient) {
    }
}
