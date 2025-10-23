package homework_generics;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        // 1
        System.out.println("1:");
        Integer[] intArray = {1, 2, 3};
        System.out.println("Before swap: " +  Arrays.toString(intArray));
        swap(intArray, 0, intArray.length - 1);
        System.out.println("After swap: " +  Arrays.toString(intArray));

        String[] stringArray = {"a", "b", "c"};
        System.out.println("Before swap: " +  Arrays.toString(stringArray));
        swap(stringArray, 0, stringArray.length - 1);
        System.out.println("After swap: " +  Arrays.toString(stringArray));

        // 2
        // The code will not compile because > cannot be applied to generics.
        // Բայց ես մասնագետ չեմ:

        // public final class Algorithm {
        //    public static <T> T max(T x, T y) {
        //    return x > y ? x : y;
        //    }
        //    }

        // 3
        // Compiles

        // public static void print(List<? extends Number> list) {
        //    for (Number n : list)
        //        System.out.print(n + " ");
        //    System.out.println();
        // }

        // 4
        System.out.println("\n4:");

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList("a", "b", "c");
        System.out.println("Max integer: " + maxRange(integerList,  0, integerList.size()));
        System.out.println("Max string: " + maxRange(stringList,  0, stringList.size()));

        // 5
        System.out.println("\n5:");

        List<Number> numberList = new ArrayList<>();
        addElement(numberList, 5);
        addElement(numberList, 4);
        System.out.println("List after addElement: " + numberList);

        List<Object> objectList = new ArrayList<>();
        addElement(objectList, "Hello");
        addElement(objectList, "Ape");
        System.out.println("List after addElement: " + objectList);

        // 7
        System.out.println("\n7:");

        List<Integer> nums = Arrays.asList(1, 4, 7, 2, 8, 5, 10, 11, 13);
        PropertyChecker<Integer> oddChecker = (Integer n) -> n % 2 != 0;
        int oddCount = countIf(nums, oddChecker);
        System.out.println("List: " + nums);
        System.out.println("Odd numbers count: " + oddCount);

        List<String> words = Arrays.asList("radar", "level", "banana", "ape", "deified");
        PropertyChecker<String> palindromeChecker = Generics::isPalindrome;
        int palindromeCount = countIf(words, palindromeChecker);
        System.out.println("List: " + words);
        System.out.println("Palindrome count: " + palindromeCount);

        // 8
        System.out.println("\n8:");

        GenericList<String> list = new GenericList<>(2);
        System.out.println("Initial List (Capacity 2): " + list);

        list.add("Apple");
        list.add("Banana");
        System.out.println("After two adds: " + list);

        list.add("Cherry");
        System.out.println("After 3rd add (Autogrow): " + list + " (Size: " + list.getSize() + ", Capacity: 4)");

        list.insertAt(1, "Grape");
        System.out.println("After insert 'Grape' at 1: " + list + " (Size: " + list.getSize() + ")");

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("'Cherry' is at index: " + list.find("Cherry"));
        System.out.println("'Kiwi' is at index: " + list.find("Kiwi"));

        System.out.println("Removing element at index 0: " + list.remove(0));
        System.out.println("After removal: " + list + " (Size: " + list.getSize() + ")");

        list.clear();
        System.out.println("After clear: " + list + " (Size: " + list.getSize() + ")");

    }

    // 1
    public static <T> void swap(T[] array, int first, int second) {
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    // 4
    public static <T extends Comparable<T>> T  maxRange(List<T> list, int first, int second) {
        if (first < 0 || second > list.size() || first >= second) {
            throw new IllegalArgumentException("Invalid range");
        }
        T max = list.get(first);
        for (int i = first + 1; i < second; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    // 5
    public static <T> void addElement(List<T> list, T element) {
        list.add(element);
    }

    // 7
    @FunctionalInterface
    public interface PropertyChecker<T> {
        boolean check(T element);
    }

    public static <T> int countIf(Collection<T> collection, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.check(element)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }

    // 8

    static class GenericList<T> {
        private T[] elements;
        private int size;
        private int capacity;

        @SuppressWarnings("unchecked")
        public GenericList(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be positive");
            }
            this.capacity = capacity;
            this.elements = (T[]) new Object[capacity];
            this.size = 0;
        }

        private void checkAccessIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
        }

        private void checkInsertionIndex(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                int newCapacity = elements.length * 2;
                this.elements = Arrays.copyOf(this.elements, newCapacity);
                this.capacity = newCapacity;
                System.out.println("(Internal: Capacity increased to " + newCapacity + ")");
            }
        }

        public int getSize() {
            return size;
        }

        public void add(T element) {
            ensureCapacity();
            elements[size++] = element;
        }

        public T get(int index) {
            checkAccessIndex(index);
            return elements[index];
        }

        public T remove(int index) {
            checkAccessIndex(index);
            T removedElement = elements[index];

            if (index < size - 1) {
                System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
            }

            elements[--size] = null;
            return removedElement;
        }

        public void insertAt(int index, T element) {
            checkInsertionIndex(index);
            ensureCapacity();

            if (index < size) {
                System.arraycopy(elements, index, elements, index + 1, size - index);
            }

            elements[index] = element;
            size++;
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
            }
            size = 0;
        }

        public int find(T element) {
            for (int i = 0; i < size; i++) {
                if (Objects.equals(element, elements[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            if (size == 0) {
                return "[]";
            }

            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(elements[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }


}
