package com.alexscode.teaching.tsp;

import java.util.List;

public class Objective {
    Instance ist;

    public Objective(Instance ist) {
        this.ist = ist;
    }

    public double distance(List<Integer> sequence){
        double d = 0;
        for (int i = 0; i < sequence.size() - 1; i++) {
            d += ist.distances[sequence.get(i)][sequence.get(i+1)];
        }
        return d + ist.distances[sequence.get(sequence.size() - 1)][sequence.get(0)];
    }
}
