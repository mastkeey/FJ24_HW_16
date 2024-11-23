package ru.mastkey.lesson16.memory;

import java.util.*;

public class OutOfMemory {
    public static void main(String[] args) {
        List<Integer[]> listForError = new LinkedList<>();
        while (true) {
            listForError.add(new Integer[1_000_000_000]);
        }
    }
}
