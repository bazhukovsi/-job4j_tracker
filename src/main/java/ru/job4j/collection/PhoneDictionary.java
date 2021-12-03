package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (key.equals(person.getName())
                    || key.equals(person.getSurname())
                    || key.equals(person.getPhone())
                    || key.equals(person.getAddress())) {
                result.add(person);
            }
        }
        return result;
    }
}
