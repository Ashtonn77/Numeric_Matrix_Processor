package processor;

public class VerticalLine implements Transpose{

    public double[][] transpose(Matrix first){

        String[][] grid = first.getGrid();
        int col = grid[0].length;

        double[][] output = new double[grid[0].length][grid.length];

        for(int i = 0; i < grid.length; i++){

            for(int j = 0; j < grid[i].length; j++){

                output[i][j] = Double.parseDouble(grid[i][col - 1 - j]);

            }

        }

        return output;

    }
    
    
}
