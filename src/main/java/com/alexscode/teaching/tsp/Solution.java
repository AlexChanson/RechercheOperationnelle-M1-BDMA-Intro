package com.alexscode.teaching.tsp;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {
    List<Integer> seq;
    String instance_id;
    int nEtu;
    int nbVilles;

    Objective objCont;

    public Solution(Instance ist, List<Integer> sequence, int nEtudiant) {
        this.seq = sequence;
        nEtu = nEtudiant;
        instance_id = ist.getFileUsed();
        objCont = new Objective(ist);
        nbVilles = ist.size;
    }

    public boolean check(){
        Set<Integer> s = new TreeSet<>(seq);
        for (Integer i : seq) {
            if (i >= nbVilles)
                return false;
        }
        return s.size() == nbVilles && nbVilles == seq.size();
    }

    public double len(){
        return objCont.distance(seq);
    }

    public void writeToFile(String path){
        try(PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(path)))){
            out.println(nEtu);
            out.println(instance_id);
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
