package processor;

public class MainTransposer implements Transpose{    

    public double[][] transpose(Matrix first){
        
        String[][] grid = first.getGrid();

        double[][] output = new double[grid[0].length][grid.length];
        
        for(int i = 0; i < grid.length; i++){
            
            for(int j = 0; j < grid[i].length; j++){
                
                output[i][j] = Double.parseDouble(grid[j][i]);
                
            }
            
        }        
        
        return output;
        
    }
   
    
}
