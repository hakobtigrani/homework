package homework_implements;

import java.util.*;

/**
 * A doubly-linked list implementation of the List interface, supporting generic types.
 *
 * @param <E> the type of elements held in this collection
 */
public class MyLinkedList<E> implements List<E> {

    private int size = 0;
    transient Node<E> first;
    transient Node<E> last;
    protected transient int modCount = 0;

    /**
     * Private static inner class representing a node in the doubly linked list.
     */
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Constructs an empty list.
     */
    public MyLinkedList() {
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
     * Links element e as the last element.
     */
    private void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        modCount++;
    }

    /**
     * Links element e before non-null Node succ.
     */
    private void linkBefore(E e, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
        modCount++;
    }

    /**
     * Unlinks non-null node x.
     */
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    /**
     * Returns the non-null Node at the specified element index.
     * Uses midpoint optimization (search from front or back).
     */
    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    /**
     * Appends the specified element to the end of this list.
     * @param e element whose presence in this collection is to be ensured
     * @return {@code true}
     */
    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }

    /**
     * @param index index of the element to return
     * @return the element at the specified position in this list.
     */
    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    /**
     * Removes the element at the specified position in this list.
     * @param index the index of the element to be removed
     * @return the element that was removed from the list.
     */
    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position.
     */
    @Override
    public E set(int index, E element) { // <-- Generic E
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    /**
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if the list contains specified element.
     */
    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.
     * @param o element to be removed from this list, if present
     * @return {@code true} if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     */
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    /**
     * Removes all the elements from the list.
     */
    @Override
    public void clear() {
        modCount++;
        Node<E> x = first;
        while (x != null) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        Itr() {
            next = first;
            nextIndex = 0;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public E next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        public void remove() {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount = modCount;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    /**
     * @return an array containing all the elements in this list in proper sequence.
     */
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }

    /**
     * Returns an array containing all the elements in this list in proper sequence.
     * @param a the array into which the elements of this list are to
     * be stored, if it is big enough; otherwise, a new array of the
     * same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        }
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next) {
            result[i++] = x.item;
        }
        if (a.length > size)
            a[size] = null;

        return a;
    }

    /**
     * @param c collection to be checked for containment in this list
     * @return {@code true} if this list contains all the elements of the
     * specified collection, {@code false} when an element is missing.
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) return false;
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
    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }

    /**
     * Inserts all the elements in the specified collection into this
     * list at the specified position.
     * @param index index at which to insert the first element from the
     * specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call.
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        checkPositionIndex(index);
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        modCount++;
        Node<E> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked") E e = (E) o;
            Node<E> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }
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
        boolean modified = false;
        for (Object item : c) {
            while (remove(item)) {
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
        Objects.requireNonNull(c);
        boolean modified = false;
        Node<E> current = first;
        while (current != null) {
            Node<E> next = current.next;
            if (!c.contains(current.item)) {
                unlink(current);
                modified = true;
            }
            current = next;
        }
        return modified;
    }

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     * this list, or -1 if this list does not contain the element
     */
    @Override
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<E> x = last; x != null; x = x.prev) {
                index--;
                if (o.equals(x.item))
                    return index;
            }
        }
        return -1;
    }

    /**
     * @return a list iterator over the elements in this list (in proper sequence).
     */
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    /**
     * @param index index of the first element to be returned from the
     * list iterator (by a call to next)
     * @return a list iterator over the elements in this list (in proper
     * sequence), starting at the specified position in the list.
     */
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    /**
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the portion of this list between the specified
     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
