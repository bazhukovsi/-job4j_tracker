package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String speciality;

    public Builder(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public void buildObject(House house) {
    }
}
