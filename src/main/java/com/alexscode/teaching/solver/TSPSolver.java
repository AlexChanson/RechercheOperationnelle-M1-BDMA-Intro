package com.alexscode.teaching.solver;

import com.alexscode.teaching.tsp.Instance;

import java.util.List;

public interface TSPSolver {
    public List<Integer> solve(Instance ist);
}
