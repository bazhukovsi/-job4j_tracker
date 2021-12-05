package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (String wordContains : text) {
            if (!check.contains(wordContains)) {
                return false;
            }
        }
        return true;
    }
}
