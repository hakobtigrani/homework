package homework14.task3;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void countChars(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(s);
        System.out.println(charCountMap);
    }

    public static void main(String[] args) {
        String string = "Hello World";
        countChars(string);
    }
}
