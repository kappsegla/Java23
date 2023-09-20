package org.example.list;

import java.util.*;

public class MyStringList implements List<String> {

    private String[] values = new String[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //Todo:
    public boolean contains(Object o) {
        return false;
    }

    //Todo:
    public Iterator<String> iterator() {
        return null;
    }

    //Todo:
    public Object[] toArray() {
        return new Object[0];
    }

    //Todo:
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(String s) {
        if (size >= values.length)
            values = Arrays.copyOf(values, values.length << 1);

        values[size++] = s;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        size = 0;
        values = new String[10];
    }

    public String get(int index) {

        if( index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        return values[index];
    }

    public String set(int index, String element) {
        return null;
    }

    public void add(int index, String element) {

    }

    public String remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<String> listIterator() {
        return null;
    }

    public ListIterator<String> listIterator(int index) {
        return null;
    }

    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
