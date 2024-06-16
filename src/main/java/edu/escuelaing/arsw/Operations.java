package edu.escuelaing.arsw;

public class Operations {
    public Double mean(NumberList<?> list){
        return list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public Double standardDeviation(NumberList<?> list){
        Double media = mean(list);
        Double variance = list.stream()
                .mapToDouble(num -> Math.pow(num - media, 2))
                .sum() / (list.size() - 1);
        return Math.sqrt(variance);
    }

}
