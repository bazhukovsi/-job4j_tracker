package ru.job4j.tracker;

public class SingleTracker {
    private static MemTracker memTracker = null;

    private SingleTracker() {
    }

    public static MemTracker getInstance() {
        if (memTracker == null) {
            memTracker = new MemTracker();
        }
        return memTracker;
    }

}
