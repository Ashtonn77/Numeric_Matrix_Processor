package processor;

import java.util.Scanner;

public class InputGetter {

    public int[] getInput(){

        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");

        return new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1])};

    }
    
}
