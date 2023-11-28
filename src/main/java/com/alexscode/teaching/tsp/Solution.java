package com.alexscode.teaching.tsp;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    List<Integer> seq;
    String instance_id;
    int timeBudget;
    int maxDistance;
    int nEtu;

    Objective objCont;

    public Solution(Instance ist, List<Integer> sequence, int nEtudiant) {
        this.seq = sequence;
        nEtu = nEtudiant;
        instance_id = ist.getFileUsed();
        objCont = new Objective(ist);
    }

    public boolean check(){
        return true; //TODO
    }

    public double len(){
        return objCont.distance(seq);
    }

    public void writeToFile(String path){
        try(PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(path)))){
            out.println(nEtu);
            out.println(instance_id);
            out.println(timeBudget);
            out.println(maxDistance);
            out.println(seq.stream().map(Object::toString).collect(Collectors.joining(",")));
        } catch (IOException e){
            e.printStackTrace(System.err);
        }
    }

    @Override
    public String toString() {
        return "Solution -> " +seq;
    }
}
