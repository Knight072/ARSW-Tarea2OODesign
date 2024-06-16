package edu.escuelaing.arsw;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Main <file or directory>");
            return;
        }
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        NumberList<?> numeros = new NumberList<>();
        reader.lines()  // Obtiene un Stream de líneas del archivo
                .map(String::trim)     // Elimina espacios en blanco de cada línea
                .map(Double::parseDouble) // Convierte cada línea en un double
                .forEach(numeros::add); // Añade cada número a 'numeros'

        reader.close();
        System.out.println(new Operations().mean(numeros));
        System.out.println(new Operations().standardDeviation(numeros));
    }
}