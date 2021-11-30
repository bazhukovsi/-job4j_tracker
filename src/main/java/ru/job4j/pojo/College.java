package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Bazhukov Sergey");
        student.setGroup("121/5");
        student.setBirthday(new Date(67, 10, 6));
        System.out.println("Студент " + student.getFio() + " с датой рождения " + student.getBirthday()
                + " учится в группе " + student.getGroup());
    }
}
