package com.company;

public interface Interface {
    String open();
    default String read() {
        return ("You are reading your book");
    }
}
