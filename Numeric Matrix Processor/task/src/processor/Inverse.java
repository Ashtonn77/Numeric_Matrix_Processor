package processor;

public class Inverse {

    Determinant determinant;
    AdjointMatrix adjointMatrix;
    
    public Inverse(Determinant determinant, AdjointMatrix adjointMatrix){
        this.determinant = determinant;
        this.adjointMatrix = adjointMatrix;
    }
    
    private double[][] getInverse(double[][] inputMatrix, String[][] stringRendition){
        
        double[][] output = new double[inputMatrix.length][inputMatrix.length];
        
        
        double det = determinant.calculateDeterminant(inputMatrix);
 
        double[][] adjoint = adjointMatrix.getAdjoint(stringRendition);
        
        for(int i = 0; i < inputMatrix.length; i++)
            for(int j = 0; j < inputMatrix.length; j++)                
                output[i][j] = adjoint[i][j] / det;
            
        return output;
        
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

        double[][] output = determinant.convert(one);
        double[][] result = getInverse(output, one.getGrid());
     
        if(Double.isInfinite(result[0][0])){

            System.out.println("This matrix doesn't have an inverse.\n");
            
        }else{

            System.out.println("The result is: ");
            new PrintMatrix().print(result);
            System.out.println("");
            
        }
        
    }
        
}
