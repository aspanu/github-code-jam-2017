package org.aspanu.codejam2017.tidyproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aspanu on 4/8/17.
 */
public class InputIngest {
    Scanner scanner;
    Integer numProbs;
    List<Long> inputNumbers;

    public InputIngest() {
        scanner = new Scanner(System.in);
        numProbs = -1;
        inputNumbers = new ArrayList<Long>();
    }

    public void init() {
        numProbs = scanner.nextInt();
        for (int i = 0; i < numProbs; i++) {
            inputNumbers.add(scanner.nextLong());
        }
    }

    public Integer getNumProbs() {
        return numProbs;
    }

    public List<Long> getInputNumbers() {
        return inputNumbers;
    }
}
