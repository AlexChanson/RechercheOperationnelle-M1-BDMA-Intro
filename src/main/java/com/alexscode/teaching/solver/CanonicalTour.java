package com.alexscode.teaching.solver;

import com.alexscode.teaching.tsp.Instance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CanonicalTour implements TSPSolver{
    @Override
    public List<Integer> solve(Instance ist) {
        return IntStream.range(0, ist.getSize()).boxed().collect(Collectors.toList());
    }
}
