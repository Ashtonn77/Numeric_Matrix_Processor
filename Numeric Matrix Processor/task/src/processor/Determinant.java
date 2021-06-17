package processor;

import javax.swing.*;

public class Determinant {    
    
    public double calculateDeterminant(double[][] matrix){
        
        int row = matrix.length;        
        
        if(row == 1) return matrix[0][0];
        else if(row == 2) 
            return calculateDeterminant(matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1]);
        else{
            
            double answer = 0;
            for(int j = 0; j < row; j++){
                
                double cofactor = Math.pow(-1, j) * matrix[0][j] 
                        * calculateDeterminant(getSmallerMatrix(matrix, 0, j));    
                answer += cofactor;
            }
                        
            return answer;
        }
              
    }    
   
    private double calculateDeterminant(double a, double b, double c, double d){        
        return (a * d) - (b * c);        
    }
      
    private double[][] getSmallerMatrix(double[][] ogMatrix, int row, int column){
        
        double[][] newMatrix = new double[ogMatrix.length-1][ogMatrix.length-1];
        int x = 0, y = 0;
        
        for(int i = row + 1; i < ogMatrix.length; i++){
            
            for(int j = 0; j < ogMatrix[i].length; j++){
                
                if(j == column) continue;                
                newMatrix[x][y++] = ogMatrix[i][j];
                
            }
            x++;
            y = 0;
            
        }
        
        return newMatrix;
        
    }
    
    public void getResult(){

        System.out.print("Enter matrix size: ");
        int[] first_m = new InputGetter().getInput();

        System.out.println("Enter matrix: ");
        Matrix one = new Matrix(first_m[0], first_m[1]);
        
        if(first_m[0] != first_m[1]){
            System.out.println("Invalid size");
            return;
        }
        
        double[][] output = convert(one);
        
        System.out.println("The result is: ");
        System.out.println(calculateDeterminant(output));
        System.out.println("");

    }

    public double[][] convert(Matrix one) {
                
        double[][] output = new double[one.getGrid().length][one.getGrid().length];
        for(int i = 0; i < output.length; i++)
            for(int j = 0; j < output[i].length; j++)
                output[i][j] = Double.parseDouble(one.getGrid()[i][j]);
        
        return output;    
            
    }

}
