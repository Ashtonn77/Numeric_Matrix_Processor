package processor;

import java.util.Scanner;

public class Matrix {
    
    private final String[][] grid;
    
    public Matrix(int row, int col){
        
        this.grid = new String[row][col];
        build(row);
        
    }
    
    private void build(int row){

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < row; i++){
            
            String r = in.nextLine();
            this.grid[i] = r.split(" ");
            
        }
               
    }
    
    public String[][] getGrid() {
        return grid;
    }
}
