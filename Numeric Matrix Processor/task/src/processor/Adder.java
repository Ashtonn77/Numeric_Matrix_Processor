package processor;

public class Adder {
    
    private double[][] add(String[][] one, String[][] two){

        double[][] output = new double[one.length][one[0].length];

        for(int i = 0; i < two.length; i++){

            for(int j = 0; j < two[0].length; j++){

                double k = Double.parseDouble(one[i][j]) + Double.parseDouble(two[i][j]);
                output[i][j] = k;

            }


        }

        return output;
    }


    void getResult(){

        System.out.print("Enter size of first matrix: ");
        int[] first = new InputGetter().getInput();
        System.out.println(first.length);

        System.out.println("Enter first matrix:");
        Matrix one = new Matrix(first[0], first[1]);

        System.out.print("Enter size of second matrix: ");
        int[] second = new InputGetter().getInput();

        if (first[0] != second[0] || first[1] != second[1]) {
            System.out.println("The operation cannot be performed.\n");
            return;
        }

        System.out.println("Enter second matrix: ");
        Matrix two = new Matrix(second[0], second[1]);

        System.out.println("The result is:");
        new PrintMatrix().print(add(one.getGrid(), two.getGrid()));
        System.out.println("");


    }
    
    
}
