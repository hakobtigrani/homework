package homework_collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetTasks {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
