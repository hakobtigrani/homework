package homework_collections;

import java.util.*;

public class LinkedListTasks {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>(Arrays.asList("a", "b", "c", "b", "a"));
        System.out.println(originalList);

        // 1
        LinkedList<String> reversed = new LinkedList<>(originalList);
        Collections.reverse(reversed);
        System.out.println("\n1: " + reversed);

        // 2
        String middle = findMiddle(originalList);
        System.out.println("\n2: " + middle);

        // 3
        boolean isPal = isPalindrome(originalList);
        System.out.println("\n3: " + isPal);

        // 4
        LinkedHashSet<String> noDupes = new LinkedHashSet<>(originalList);
        originalList.clear();
        originalList.addAll(noDupes);
        System.out.println("\n4: " + noDupes);
    }

    public static String findMiddle(LinkedList<String> list) {
        if (list == null || list.isEmpty()) return null;

        Iterator<String> slow = list.iterator();
        Iterator<String> fast = list.iterator();

        while (fast.hasNext()) {
            fast.next();
            if (fast.hasNext()) {
                fast.next();
                slow.next();
            }
        }

        return slow.next();
    }

    public static boolean isPalindrome(LinkedList<String> list) {
        if (list == null || list.isEmpty()) return true;

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }

}
