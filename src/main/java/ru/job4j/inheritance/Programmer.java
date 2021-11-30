package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String speciality;

    public Programmer(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public void writeCode(Language language) {

    }
}
