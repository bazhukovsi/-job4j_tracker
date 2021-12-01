package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int randValue = new Random().nextInt(3);
        if (randValue == 0) {
            System.out.println("Да");
        } else if (randValue == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть.");
        }
    }
}
