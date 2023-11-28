package com.alexscode.teaching.tsp;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Instance {
    int size;
    double[][] distances;
    String fileUsed;

    public static Instance readFile(String path){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new Instance(0, null, path);
        }

        String line = scanner.nextLine();
        int nbActions = Integer.parseInt(line);

        String[] val;
        int i = 0;
        double[][] distances = new double[nbActions][nbActions];
        while (scanner.hasNext()) {
            line = scanner.nextLine();

            val = line.split(" ");
            for (int j = 0; j < nbActions; j++) {
                //System.out.println("val "+ val[j]);
                distances[i][j] = Double.parseDouble(val[j]);
            }
            i++;
        }
        String filename = (new File(path)).getName();
        return new Instance(nbActions, distances, filename);
    }
}
