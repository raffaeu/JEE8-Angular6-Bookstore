package com.pluralsight.bookstore.utils;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {

    @Override
    public String generateNumber() {
        return "13-577-" + Math.abs(new Random().nextInt());
    }
}
