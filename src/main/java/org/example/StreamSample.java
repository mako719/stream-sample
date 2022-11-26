package org.example;

import java.util.List;


public class StreamSample {
    public static void main(String[] args) {
        List<String> dogs = List.of("chihuahua", "toy poodle", "french bulldog", "mameshiba");
        List<String> result = dogs.stream().filter(dog -> dog.contains("e")).toList();
        List<String> upperCaseLetter = dogs.stream().map(String::toUpperCase).toList();
        boolean hasGoldenRetriever = dogs.stream().noneMatch(StreamSample::test);

        System.out.println(result);
        System.out.println(hasGoldenRetriever);
        System.out.println(upperCaseLetter);

    }


    private static boolean test(String dog) {
        return dog == "golden retroiever";
    }
}