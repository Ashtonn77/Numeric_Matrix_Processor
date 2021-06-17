package processor;

public class AdjointMatrix {
    
    Determinant determinant;
    CofactorMatrix cofactorMatrix;
    
    public  AdjointMatrix(Determinant determinant, CofactorMatrix cofactorMatrix){
        
        this.determinant = determinant;
        this.cofactorMatrix = cofactorMatrix;
        
    }
    
    double[][] getAdjoint(String[][] inputMatrix){
        
        double[][] output = new double[inputMatrix.length][inputMatrix.length];
        
        int sign = 1;
        
        for(int i = 0; i < inputMatrix.length; i++){
            
            for(int j = 0; j < inputMatrix.length; j++){

                double[][] temp = cofactorMatrix.getCofactor(inputMatrix, i, j);
                sign = ((i + j) % 2 == 0) ? 1 : -1;
                output[j][i] = sign * determinant.calculateDeterminant(temp);

            }            
            
        }
        
        return output;
        
    }
    
}
