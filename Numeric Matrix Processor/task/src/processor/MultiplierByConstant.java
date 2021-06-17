package processor;


import java.util.Scanner;

public class MultiplierByConstant {

    private double[][] multiply(String[][] grid, double multiplier) {

        double[][] output = new double[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                output[i][j] = multiplier % 1 == 0 && Float.parseFloat(grid[i][j]) % 1 == 0
                        ? Integer.parseInt(grid[i][j]) * (int)multiplier
                        : Float.parseFloat(grid[i][j]) * multiplier;
            }
        return output;

    }
    
    void getResult(){

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter size of first matrix: ");
        int[] first_c = new InputGetter().getInput();

        System.out.println("Enter first matrix:");
        Matrix one_c = new Matrix(first_c[0], first_c[1]);

        System.out.print("Enter constant: ");
        String d = in.next();
        double constant = Float.parseFloat(d);

        System.out.println("The result is:");
        new PrintMatrix().print(multiply(one_c.getGrid(), constant));
        System.out.println("");
        
        
    }

}
