package processor;

public class CofactorMatrix {

    // Function to get cofactor of inputMatrix[p][q] in output[][]
    double[][] getCofactor(String[][] inputMatrix, int p, int q){
        
        double[][] output = new double[inputMatrix.length-1][inputMatrix.length-1];
        int i = 0, j  = 0;
        
        for(int row = 0; row < inputMatrix.length; row++){
            
            for(int col = 0; col < inputMatrix.length; col++){
                
                if(row != p && col != q) {
                    
                    output[i][j++] = Double.parseDouble(inputMatrix[row][col]);

                    if (j == inputMatrix.length - 1) {
                        j = 0;
                        i++;
                    }

                } 
                
            }

            
        }
   
        return output;
        
    }
    
}
