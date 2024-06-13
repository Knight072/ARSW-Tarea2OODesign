package edu.escuelaing.arsw;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Main <file or directory>");
            return;
        }
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Integer> numeros = reader.lines().map(Integer::parseInt).toList();
        System.out.println(numeros);
    }
}