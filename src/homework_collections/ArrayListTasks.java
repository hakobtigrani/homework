package homework_collections;

import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 5, 58, 0, 58, 75, 23, 75, 100));
        System.out.println("Original List: " + originalList);

        // 1
        List<Integer> copiedList = List.copyOf(originalList);
        System.out.println("1: " + copiedList);

        // 2
        List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        System.out.println("\n2: " + reversedList);

        // 3
        List<Integer> swapElements = new ArrayList<>(originalList);
        Collections.swap(swapElements, 1, 2);
        System.out.println("\n3: " + swapElements);

        // 4
        System.out.println("\n4: ");
        for (Integer integer : originalList) {
            System.out.println(integer);
        }

        // 5
        List<Integer> sortedList = new ArrayList<>(originalList);
        Collections.sort(originalList);
        System.out.println("\n5: " + sortedList);

        // 6
        List<Integer> removeDubs = new ArrayList<>(new LinkedHashSet<>(originalList));
        System.out.println("\n6: " + removeDubs);

        // 7
        List<Integer> unoriginalList = new ArrayList<>(Arrays.asList(58, 7, 75, 200, 0));
        System.out.println(unoriginalList);
        Set<Integer> common = findCommonElements(originalList, unoriginalList);
        System.out.println("\n7: " + common);

        // 8
        Optional<Integer> largest = findLargest(originalList);
        System.out.println("\n8: " + largest);

        // 9
        List<Integer> combinedLists = new ArrayList<>(originalList);
        combinedLists.addAll(unoriginalList);
        System.out.println("\n9: " + combinedLists);

        // 10
        Optional<Integer> secondLargest = findSecondLargest(originalList);
        System.out.println("\n10: " + secondLargest);
    }

    public static Set<Integer> findCommonElements(List<Integer> a, List<Integer> b) {
        Set<Integer> setA = new HashSet<>(a);
        Set<Integer> setB = new HashSet<>(b);
        setA.retainAll(setB); // intersection
        return setA;
    }

    public static Optional<Integer> findLargest(List<Integer> list) {
        if (list == null || list.isEmpty()) return Optional.empty();
        return Optional.of(Collections.max(list));
    }

    public static Optional<Integer> findSecondLargest(List<Integer> list) {
        if (list == null || list.isEmpty()) return Optional.empty();
        NavigableSet<Integer> unique = new TreeSet<>(list);
        if (unique.size() < 2) return Optional.empty();

        Iterator<Integer> desc = unique.descendingIterator();
        desc.next();
        return Optional.of(desc.next());
    }
}
