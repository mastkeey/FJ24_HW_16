package ru.mastkey.lesson16.memory;

public class StackOverFlow {
    public static void main(String[] args) {
        recursion();
    }

    private static void recursion() {
        recursion();
    }
}

