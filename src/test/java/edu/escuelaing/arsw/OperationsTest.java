package edu.escuelaing.arsw;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperationsTest {

    @Test
    public void testMeanColumn1() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(160.0);
        numeros.add(591.0);
        numeros.add(114.0);
        numeros.add(229.0);
        numeros.add(230.0);
        numeros.add(270.0);
        numeros.add(128.0);
        numeros.add(1657.0);
        numeros.add(624.0);
        numeros.add(1503.0);

        Double expectedMean = 550.6;
        Double actualMean = new Operations().mean(numeros);
        assertEquals(expectedMean, actualMean, 0.01);
    }

    @Test
    public void testStandardDeviationColumn1() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(160.0);
        numeros.add(591.0);
        numeros.add(114.0);
        numeros.add(229.0);
        numeros.add(230.0);
        numeros.add(270.0);
        numeros.add(128.0);
        numeros.add(1657.0);
        numeros.add(624.0);
        numeros.add(1503.0);

        Double expectedStandardDeviation = 572.03;
        Double actualStandardDeviation = new Operations().standardDeviation(numeros);
        assertEquals(expectedStandardDeviation, actualStandardDeviation, 0.01);
    }

    @Test
    public void testMeanColumn2() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(15.0);
        numeros.add(69.9);
        numeros.add(6.5);
        numeros.add(22.4);
        numeros.add(28.4);
        numeros.add(65.9);
        numeros.add(19.4);
        numeros.add(198.7);
        numeros.add(38.8);
        numeros.add(138.2);

        Double expectedMean = 60.32;
        Double actualMean = new Operations().mean(numeros);
        assertEquals(expectedMean, actualMean, 0.01);
    }

    @Test
    public void testStandardDeviationColumn2() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(15.0);
        numeros.add(69.9);
        numeros.add(6.5);
        numeros.add(22.4);
        numeros.add(28.4);
        numeros.add(65.9);
        numeros.add(19.4);
        numeros.add(198.7);
        numeros.add(38.8);
        numeros.add(138.2);

        Double expectedStandardDeviation = 62.26;
        Double actualStandardDeviation = new Operations().standardDeviation(numeros);
        assertEquals(expectedStandardDeviation, actualStandardDeviation, 0.01);
    }

    @Test
    public void testMeanColumn3() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(186.0);
        numeros.add(699.0);
        numeros.add(132.0);
        numeros.add(272.0);
        numeros.add(291.0);
        numeros.add(331.0);
        numeros.add(199.0);
        numeros.add(1890.0);
        numeros.add(788.0);
        numeros.add(1601.0);

        Double expectedMean = 638.9;
        Double actualMean = new Operations().mean(numeros);
        assertEquals(expectedMean, actualMean, 0.01);
    }

    @Test
    public void testStandardDeviationColumn3() {
        NumberList<Double> numeros = new NumberList<>();
        numeros.add(186.0);
        numeros.add(699.0);
        numeros.add(132.0);
        numeros.add(272.0);
        numeros.add(291.0);
        numeros.add(331.0);
        numeros.add(199.0);
        numeros.add(1890.0);
        numeros.add(788.0);
        numeros.add(1601.0);

        Double expectedStandardDeviation = 625.633981;
        Double actualStandardDeviation = new Operations().standardDeviation(numeros);
        assertEquals(expectedStandardDeviation, actualStandardDeviation, 0.01);
    }
}


