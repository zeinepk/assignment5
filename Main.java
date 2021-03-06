package com.company;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Interface book1 = new Interface() {
            @Override
            public String open() {
                return("book is open");
            }
        };

        System.out.println(book1.open());
        System.out.println(book1.read());


        final Book harry_potter = Book.class.getConstructor(int.class, String.class, int.class, int.class).newInstance(1, "Harry Potter", 4, 50);

        System.out.println(harry_potter.isAvailable());
        System.out.println(harry_potter.isPopular());
    }
}
