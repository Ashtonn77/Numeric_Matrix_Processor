package processor;

public class SideTransposer implements Transpose {

    public double[][] transpose(Matrix first){

        String[][] grid = first.getGrid();
        int row = grid.length;
        int col = grid[0].length;

        double[][] output = new double[grid[0].length][grid.length];

        for(int i = 0; i < grid.length; i++){

            for(int j = 0; j < grid[i].length; j++){

                output[i][j] = Double.parseDouble(grid[col - 1 - j][row - 1 - i]);

            }

        }

        return output;

    }


    
}
