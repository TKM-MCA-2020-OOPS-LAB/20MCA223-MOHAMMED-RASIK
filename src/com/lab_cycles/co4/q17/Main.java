package com.lab_cycles.co4.q17;

// Java program to illustrate HashMap class of java.util
// package

// Importing HashMap class
import java.util.HashMap;

// Main class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard add() method
        map.put("Germany", 4);
        map.put("England", 1);
        map.put("Brazil", 5);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("England")) {

            // Mapping
            Integer a = map.get("England");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"England\" is:- " + a);
        }
    }
}
