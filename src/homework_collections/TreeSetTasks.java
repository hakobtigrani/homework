package homework_collections;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String [] words = sentence.split("\\s+");
        TreeSet<String> uniqueWords = new TreeSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);
        scanner.close();

        int [] numbers = {7, 3, 9, 1, 3, 7, 5};
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : numbers) {
            sortedSet.add(num);
        }
        System.out.println(sortedSet);

        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 1; i <= 100; i++) {
            nums.add(i);
        }
        SortedSet<Integer> subset = nums.subSet(25, 50);
        System.out.println(subset);
    }
}
