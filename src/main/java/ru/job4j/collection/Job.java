package ru.job4j.collection;

import java.util.Comparator;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }

    public static class JobAscByName implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class JobDescByName implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }

    public static class JobAscByPriority implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return Integer.compare(o1.getPriority(), o2.getPriority());
        }
    }

    public static class JobDescByPriority implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return Integer.compare(o2.getPriority(), o1.getPriority());
        }
    }
}
