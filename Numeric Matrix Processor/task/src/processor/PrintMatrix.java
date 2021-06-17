package processor;

import java.util.List;

public class PrintMatrix {

    void print(double[][] grid){

        for (double[] values : grid) {

            for (int j = 0; j < grid[0].length; j++) {
                 
                System.out.print(values[j] + " ");

            }

            System.out.println("");

        }

    }

    void print(List<List<Double>> grid){

        for (List<Double> integers : grid) {

            for (int j = 0; j < grid.get(0).size(); j++) {

                System.out.print(integers.get(j) + " ");

            }

            System.out.println("");

        }

    }
    
    
}
