package edu.escuelaing.arsw;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

public class NumberListTest {

    @Test
    public void testAddAndSize() {
        NumberList<Double> numeros = new NumberList<>();
        assertTrue(numeros.isEmpty());
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);
        assertEquals(3, numeros.size());
        assertFalse(numeros.isEmpty());
    }

    @Test
    public void testIterator() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);

        Iterator<Double> it = numeros.iterator();
        assertTrue(it.hasNext());
        assertEquals(1.0, it.next(), 0.01);
        assertEquals(2.0, it.next(), 0.01);
        assertEquals(3.0, it.next(), 0.01);
        assertFalse(it.hasNext());
    }

    @Test
    public void testToArray() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);

        Double[] array = (Double[]) numeros.toArray();
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0}, array);
    }

}

