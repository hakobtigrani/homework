package Implement;

import java.util.*;

public class MyArrayList implements List<Integer> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private static final Object[] DEFAULT_CAP_EED = {}; // default capacity for empty element data
    transient Object[] elementData;
    private int size;
    protected transient int modCount = 0;

    /**
     * Constructs an empty list with initial capacity.
     * @param initialCapacity - the init capacity for the list.
     * @throws IllegalArgumentException - throws if the init capacity is negative.
     */
    public MyArrayList (int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException("Illegal capacity brat: " + initialCapacity);
        }
    }

    /**
     * Constructs an empty list with default initial capacity (10)
     */
    public MyArrayList() {
        this.elementData = DEFAULT_CAP_EED;
    }

    /**
     * @return the number of elements in the list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @return {@code true} if the list is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if the list contains specified element.
     */
    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    /**
     * @return an iterator over the elements in this list in proper sequence.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }

    /**
     * @return an array containing all the elements in this list in proper sequence.
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    /**
     * Returns an array containing all the elements in this list in proper sequence.
     * @param a the array into which the elements of this list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list
     * @param <T>
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > 0)
            a[size] = null;
        return a;
    }

    /**
     * Appends the specified element to the end of this list.
     * @param integer element whose presence in this collection is to be ensured
     * @return {@code true}
     */
    @Override
    public boolean add(Integer integer) {
        modCount++;
        if (size == elementData.length) {
            elementData = grow();
        }
        elementData[size] = integer;
        size++;
        return true;
    }

    /**
     * Increases the capacity of the elementData array. This is called when the
     * list is full and a new element is about to be added. The new capacity will
     * be 1.5 times the old capacity. If the list was initially empty, it grows
     * to the {@code DEFAULT_CAPACITY}.
     * @return the new, larger elementData array with all old elements copied over.
     */
    private Object[] grow() {
        int oldCapacity = elementData.length;
        if (oldCapacity == 0 && elementData == DEFAULT_CAP_EED) {
            return elementData = new Object[DEFAULT_CAPACITY];
        }
        int newCapacity = (int) (oldCapacity * 1.5);
        return elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /**
     * This method finds the element's index. If the index is 0 or greater,
     * it calls {@code fastRemove} and returns {@code true}.
     * If not found, it does nothing and returns {@code false}.
     * @param o element to be removed from this list, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index >= 0) {
            fastRemove(index);
            return true;
        }
        return false;
    }

    /**
     * Method to remove an element without bounds checking
     * or returning the removed value.
     * @param index
     */
    private void fastRemove(int index) {
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved == 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
    }

    /**
     * @param c collection to be checked for containment in this list
     * @return {@code true} if this list contains all the elements of the
     * specified collection, {@code false} when an element is missing.
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Appends all the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.
     * @param c collection containing elements to be added to this collection
     * @return {@code true} if this list changed as a result of the call.
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0) {
            return false;
        }
        modCount++;

        if (numNew > elementData.length - size) {
            elementData = grow(size + numNew);
        }

        System.arraycopy(a, 0, elementData, size, numNew);
        size += numNew;
        return true;
    }

    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        return elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /**
     * Inserts all the elements in the specified collection into this
     * list at the specified position.
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call.
     * @throws IndexOutOfBoundsException
     */
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0) {
            return false;
        }
        modCount++;
        if (numNew > elementData.length - size) {
            elementData = grow(size + numNew);
        }
        int numMoved = size - index;
        if (numMoved > 0) {
            System.arraycopy(elementData, index, elementData, index + numNew, numMoved);
        }
        System.arraycopy(a, 0, elementData, index, numNew);
        size += numNew;
        return true;
    }

    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection.
     * @param c collection containing elements to be removed from this list
     * @return {@code true} if this list changed as a result of the call
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return batchRemove(c, false);
    }

    /**
     * Method to handle both {@code removeAll} and {@code retainAll} logic.
     * @param c The collection to check against.
     * @param complement If true, we KEEP elements in c (retainAll).
     * If false, we REMOVE elements in c (removeAll).
     * @return true if the list was modified.
     */
    private boolean batchRemove(Collection<?> c, boolean complement) {
        final Object[] es = elementData;
        int r = 0, w = 0;
        boolean modified = false;

        try {
            for (; r < size; r++) {
                if (c.contains(es[r]) == complement) {
                    es[w++] = es[r];
                }
            }
        } finally {
            if (r != size) {
                System.arraycopy(es, r, es, w, size - r);
                w += size - r;
            }
            if (w != size) {
                for (int i = w; i < size; i++) {
                    es[i] = null;
                }
                modCount += size - w;
                size = w;
                modified = true;
            }
        }
        return modified;
    }

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection. In other words, removes from this list all
     * of its elements that are not contained in the specified collection.
     * @param c collection containing elements to be retained in this list
     * @return {@code true} if this list changed as a result of the call.
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return batchRemove(c,true);
    }

    /**
     * Removes all the elements from the list.
     */
    @Override
    public void clear() {
        modCount++;
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    /**
     * @param index index of the element to return
     * @return the element at the specified position in this list.
     */
    @Override
    public Integer get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (Integer) elementData[index];
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position.
     */
    @Override
    public Integer set(int index, Integer element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Integer oldValue = (Integer) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, Integer element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        modCount++;
        if (size == elementData.length) {
            elementData = grow();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left.
     * @param index the index of the element to be removed
     * @return the element that was removed from the list.
     */
    @Override
    public Integer remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        modCount++;
        Integer oldValue = (Integer) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public int indexOf(Object o) { return indexOfRange(o, 0, size); }

    int indexOfRange(Object o, int start, int end) {
        Object[] es = elementData;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    private class Itr implements Iterator<Integer> {
        int cursor = 0;
        int expectedModCount = modCount;

        /**
         * Checks if we have more elements to go through.
         */
        public boolean hasNext() {
            return cursor != size;
        }

        /**
         * @return the next element.
         */
        public Integer next() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Integer element = (Integer) elementData[cursor];
            cursor++;
            return element;
        }
    }
}
