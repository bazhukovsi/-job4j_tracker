package ru.job4j.oop;

public class Student {
    public void music(int i) {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();
        petya.music(1);
        petya.music(1);
        petya.music(1);
    }
}
