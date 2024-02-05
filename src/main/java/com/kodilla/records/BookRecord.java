package com.kodilla.records;

public record BookRecord(String author, String title, int year) {
    public static void doSomething() {
        System.out.println("Doing something");
    }
}
