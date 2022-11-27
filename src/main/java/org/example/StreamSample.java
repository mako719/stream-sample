package org.example;

import java.util.List;


public class StreamSample {
    public static void main(String[] args) {
        List<String> dogs = List.of("chihuahua", "toy poodle", "french bulldog", "mameshiba");
        List<String> result = dogs.stream().filter(dog -> dog.contains("e")).toList();
        List<String> upperCaseLetter = dogs.stream().map(String::toUpperCase).toList();
        boolean hasGoldenRetriever = dogs.stream().noneMatch(StreamSample::isGoldenRetriever);

        System.out.println(result);
        System.out.println(upperCaseLetter);
        System.out.println(hasGoldenRetriever);
        
    }


    private static boolean isGoldenRetriever(String dog) {
        return dog.equals("golden retriever");
    }
}