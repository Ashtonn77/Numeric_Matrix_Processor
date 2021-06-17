package processor;

import java.util.ArrayList;
import java.util.List;

public class MultiplierOfMatrices {

    private List<List<Double>> multiply(Matrix first, Matrix second){
                
        List<List<Double>> output = new ArrayList<>();
        List<Double> temp = new ArrayList<>();
        String[][] one = first.getGrid();
        String[][] two = second.getGrid();
        
        for(int i = 0; i < one.length; i++){            
                        
            for(int j = 0; j < two[i].length; j++){
             
                double sum = 0;
                
                for(int k = 0; k < two.length; k++){


                    double _p = Double.parseDouble(one[i][k]);
                    double _q = Double.parseDouble(two[k][j]);
                    
                    sum += (_p * _q);
                    
                }                
                
                temp.add(sum);
                
            }
           
            output.add(temp);
            temp = new ArrayList<>();
            
        }        
        
        return output;
        
    }
        
    void getResult(){

        System.out.print("Enter size of first matrix: ");
        int[] first_m = new InputGetter().getInput();

        System.out.println("Enter first matrix: ");
        Matrix one_m = new Matrix(first_m[0], first_m[1]);

        System.out.print("Enter size of second matrix: ");
        int[] second_m = new InputGetter().getInput();


        System.out.println("Enter second matrix: ");
        Matrix two_m = new Matrix(second_m[0], second_m[1]);

        if (first_m[1] != second_m[0]) {
            System.out.println("The operation cannot be performed.\n");
            return;
        }

        System.out.println("The result is: ");
        new PrintMatrix().print(multiply(one_m, two_m));
        System.out.println("");


    }
    
    
}

