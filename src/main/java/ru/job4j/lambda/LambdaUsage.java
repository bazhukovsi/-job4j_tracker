package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sergey");
        arrayList.add("Anna-Mariya");
        arrayList.add("Boris");
        arrayList.add("Vovochka");
        System.out.println("До сортировки : " + arrayList);
        System.out.println("-----------------------");
        Comparator<String> comparatorDescLength = (o1, o2) -> {
            System.out.println("compare " + o2.length() + " : " + o1.length());
            return o2.length() - o1.length();
        };
        arrayList.sort(comparatorDescLength);
        System.out.println("-----------------------");
        System.out.println("После сортировки : " + arrayList);
    }
}

