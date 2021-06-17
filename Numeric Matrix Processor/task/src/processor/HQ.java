package processor;

import java.util.Scanner;

public class HQ {


    void start() {

        Scanner in = new Scanner(System.in);
        int choice = -1;

        do {

            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Calculate a determinant");
            System.out.println("6. Inverse matrix");
            System.out.println("0. Exit");

            String tmp = in.nextLine();
            if (tmp.length() == 0) continue;

            String[] convert = tmp.split(" ");

            if (convert.length != 1) {
                continue;
            }

            choice = Integer.parseInt(convert[0]);
            System.out.println("Your choice: " + choice);

            switch (choice) {

                case 1:
                    new Adder().getResult();
                    break;

                case 2:
                    new MultiplierByConstant().getResult();
                    break;

                case 3:
                    new MultiplierOfMatrices().getResult();
                    break;

                case 4:
                    transposeStart();
                    break;

                case 5:
                    new Determinant().getResult();
                    break;
                
                case 6:
                    Determinant determinant = new Determinant();
                    new Inverse(determinant, new AdjointMatrix(determinant, new CofactorMatrix())).getResult();
                    break;
                    
                case 0:
                    break;

                default:
                    System.out.println("Invalid command\n");
                    break;

            }


        } while (choice != 0);

    }


    void transposeStart() {

        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        
        Scanner inputTranspose = new Scanner(System.in);
        int choice = inputTranspose.nextInt();
        System.out.println("Your choice: " + choice);

        switch (choice) {

            case 1:
                new Transposer().transposeMain();
                break;

            case 2:
                new Transposer().transposeSide();
                break;

            case 3:
                new Transposer().transposeVerticalDiagonal();
                break;

            case 4:
                new Transposer().transposeHorizontalLine();
                break;

            default:
                break;

        }


    }


}
