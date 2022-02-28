package com.strings;

import java.util.Arrays;
import java.util.Locale;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

        String name = "Riya Sangwan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('i', 2));
        System.out.println(name.indexOf('i'));
        System.out.println("   riya".strip());
        System.out.println(Arrays.toString(name.split(" ")));


    }
}
