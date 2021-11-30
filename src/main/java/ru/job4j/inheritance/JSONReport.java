package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln
                + "\t\"name\" : \"" + name + "\"," + ln
                + "\t\"body\" : \"" + body + "\"" + ln
                + "}";
    }

    public static void main(String[] args) {
        TextReport textReport = new JSONReport();
        System.out.println(textReport.generate("Serg Bazhukov",
                "i like to play table tennis"));
    }
}
