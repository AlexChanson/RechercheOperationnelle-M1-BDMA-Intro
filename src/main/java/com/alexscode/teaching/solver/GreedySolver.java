package com.alexscode.teaching.solver;

import com.alexscode.teaching.tsp.Instance;

import java.util.*;

public class GreedySolver implements TSPSolver{
    @Override
    public List<Integer> solve(Instance ist) {
        Random rd = new Random();
        Set<Integer> used = new TreeSet<>();
        List<Integer> sol = new ArrayList<>(ist.getSize());

        int current = rd.nextInt(ist.getSize());
        sol.add(current);
        used.add(current);

        while (used.size() < ist.getSize()){
            int next = argMinExcept(ist.getDistances()[current], used);
            if (next != -1){
                current = next;
                sol.add(current);
                used.add(current);
            }else {
                System.err.println("ERROR no candidate city");
            }
        }

        return sol;
    }

    private static int argMinExcept(double[] vals, Set<Integer> excluded){
        int idx = -1;
        double val = Double.MAX_VALUE;

        for (int i = 0; i < vals.length; i++) {
            if (val > vals[i] && !excluded.contains(i)) {
                idx = i;
                val = vals[i];
            }
        }

        return idx;
    }
}
