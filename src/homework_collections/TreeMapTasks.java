package homework_collections;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<String, Double> students = new TreeMap<>();

        students.put("Tigran", 89.5);
        students.put("Hakob", 92.3);
        students.put("Vardan", 75.8);
        students.put("Vazgen", 95.2);
        students.put("Bagrat", 88.0);

        System.out.println("All students (alphabetical): ");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }

        double highest = Collections.max(students.values());
        System.out.println("\nHighest grades: ");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == highest) {
                System.out.println(entry.getKey() + " ----> " + entry.getValue());
            }
        }


        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("Armenia", "Yerevan");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Brazil", "Brasilia");
        countries.put("Canada", "Ottawa");
        countries.put("Germany", "Berlin");
        countries.put("India", "New Delhi");
        countries.put("Egypt", "Cairo");

        System.out.println("\nCountries and capitals (alphabetical): ");
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a country name to find its capital: ");
        String input = scanner.nextLine().trim();

        if (countries.containsKey(input)) {
            System.out.println(input + "'s capital is " + countries.get(input));
        }
        else {
            System.out.println("Country not found in the map.");
        }
        scanner.close();


        TreeMap<String, Integer> products = new TreeMap<>();

        products.put("Laptop", 1000);
        products.put("Smartphone", 800);
        products.put("Headphones", 150);
        products.put("Monitor", 300);
        products.put("Keyboard", 50);
        products.put("Mouse", 40);

        System.out.println("\nProduct prices:");

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " ----> $" + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            int increasedPrice = (int) (entry.getValue() * 1.1);
            products.put(entry.getKey(), increasedPrice);
        }

        System.out.println("\nNew product prices:");

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " ----> $" + entry.getValue());
        }


    }
}
