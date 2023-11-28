package com.alexscode.teaching;

import com.alexscode.teaching.solver.CanonicalTour;
import com.alexscode.teaching.tsp.Instance;
import com.alexscode.teaching.tsp.Objective;
import com.alexscode.teaching.solver.TSPSolver;
import com.alexscode.teaching.tsp.Solution;

public class Main {
    public static void main(String[] args) {
        Instance f4_small = Instance.readFile("./instances/tsp_60.dat");

        Objective obj = new Objective(f4_small);

        TSPSolver solver = new CanonicalTour();
        Solution solution = new Solution(f4_small, solver.solve(f4_small), 42);

        System.out.println(solution);
        System.out.println("Distance: " + solution.len());
        System.out.println("Feasible ? " + solution.check());
    }

}