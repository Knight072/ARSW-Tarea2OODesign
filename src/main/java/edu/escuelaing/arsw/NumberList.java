package edu.escuelaing.arsw;

import java.util.Collection;
import java.util.Iterator;

public class NumberList<T> implements Collection<Double> {
    private Integer size = 0;
    private NumberNode initial;
    private NumberNode head;
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Double> iterator() {
        return new Iterator<Double>() {
            private NumberNode current = initial;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Double next() {
                Double value = current.getValue();
                current = current.getNext();
                return value;
            }
        };
    }

    @Override
    public Object[] toArray() {
        NumberNode current = initial;
        Double[] array = new Double[size];
        int index = 0;
        while (index < size && current != null) {
            array[index] = current.getValue();
            current = current.getNext();
            index++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Double number) {
        NumberNode newNode = new NumberNode(number);
        if (size == 0){
            this.initial = newNode;
        }
        else{
            NumberNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        this.head = newNode;
        size += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Double> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

}
