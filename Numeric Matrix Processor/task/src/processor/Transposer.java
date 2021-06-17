package processor;

public class Transposer {
    
    //main diagonal
    void transposeMain(){
        getResult(new MainTransposer());
    }    
    
    //side diagonal
    void transposeSide(){
        getResult(new SideTransposer());
    }
    
    //vertical diagonal
    void transposeVerticalDiagonal(){
        getResult(new VerticalLine());
    }
        
    //horizontal line
    void transposeHorizontalLine(){
        getResult(new HorizontalSide());
    }

    private void getResult(Transpose transpose){

        System.out.print("Enter matrix size: ");
        int[] first_m = new InputGetter().getInput();

        System.out.println("Enter matrix: ");
        Matrix one = new Matrix(first_m[0], first_m[1]);

        System.out.println("The result is: ");
        new PrintMatrix().print(transpose.transpose(one));
        System.out.println("");

    }

    
}
