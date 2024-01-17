package org.example;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        // Creating an Optional with a value
        Optional<String> optionalWithValue = Optional.of("Hello, Optional!");

        // Creating an empty Optional
        Optional<String> optionalEmpty = Optional.empty();

        // Checking if Optional has a value
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is present: " + optionalWithValue.get());
        } else {
            System.out.println("Value is absent.");
        }

        // Using ifPresent to handle the value if present
        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // Using orElse to provide a default value if Optional is empty
        String result = optionalEmpty.orElse("Default Value");
        System.out.println("Result: " + result);

        // Using map to transform the value if present
        String transformedValue = optionalWithValue.map(String::toUpperCase).orElse("No Value");
        System.out.println("Transformed Value: " + transformedValue);
    }
}

