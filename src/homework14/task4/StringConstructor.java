package homework14.task4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringConstructor {
    public static boolean canConstruct(String target, String[] wordBank) {
        boolean[] dp = new boolean[target.length() + 1];
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordBank));
        dp[0] = true;
        for (int i = 0; i <= target.length(); i++) {
            if (dp[i]) {
                for (String word : wordSet) {
                    if (i + word.length() <= target.length() && target.startsWith(word, i)) {
                        dp[i + word.length()] = true;
                    }
                }
            }
        }
        return dp[target.length()];
    }

    public static void main(String[] args) {
        String[] words = {"ha", "kob", "tig", "rani"};

        String name = "hakobtigrani";
        if (canConstruct(name, words)) {
            System.out.println("Yeah, you can build '" + name + "' from the array bro.");
        } else {
            System.out.println("Nah, can't build it, ynger.");
        }

        String name1 = "hakobsahaki";
        if (canConstruct(name1, words)) {
            System.out.println("Yeah, you can build '" + name1 + "' from the array bro.");
        } else {
            System.out.println("Nah, can't build it, ynger.");
        }
    }
}
