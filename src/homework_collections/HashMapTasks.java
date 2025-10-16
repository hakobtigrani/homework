package homework_collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTasks {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 1
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        System.out.println(copyValues(map));

        // 2
        System.out.println(countWords("Hello my name is Vardan axper Vardan"));

        // 3
        phoneBook();

        // 4
        System.out.println(firstNonRepeating("aabbcdde"));

    }

    // 1
    public static ArrayList<Integer> copyValues(HashMap<String, Integer> map) {
        return new ArrayList<>(map.values());
    }

    // 2
    public static HashMap<String, Integer> countWords(String sentence) {
        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    // 3
    public static void phoneBook() {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Hakob", "123-456");
        phoneBook.put("Jacob", "321-456");
        phoneBook.put("Jack", "321-654");

        System.out.println("Jack's number: " + phoneBook.get("Jack"));
    }

    // 4
    public static char firstNonRepeating(String input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) return c;

        }
        return '-';
    }
}
