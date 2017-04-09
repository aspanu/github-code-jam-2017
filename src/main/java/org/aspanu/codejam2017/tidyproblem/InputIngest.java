package org.aspanu.codejam2017.tidyproblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
    private static final String DIRECTORY = "/Users/aspanu/Downloads/";
    private static final String FILE = "B-large-practice.in";
    private static final String OUTPUT_FILE = "tidy_solution.out";

    public static void main(String[] varargs) throws FileNotFoundException, UnsupportedEncodingException {
        String fileInput = DIRECTORY + FILE;
        String fileOutput = DIRECTORY + OUTPUT_FILE;
        File input = new File(fileInput);
        InputIngest inputIngest = new InputIngest(input);

        PrintWriter output = new PrintWriter(fileOutput, "UTF-8");
        inputIngest.solveTidyProblem(output);
        output.close();
    }

    public InputIngest() {
        scanner = new Scanner(System.in);
        numProbs = -1;
        inputNumbers = new ArrayList<Long>();
    }

    public InputIngest(File inputFile) throws FileNotFoundException {
        scanner = new Scanner(inputFile);
        numProbs = -1;
        inputNumbers = new ArrayList<Long>(100);
        init();
    }

    public void solveTidyProblem(PrintWriter output) {
        TidyProblem tidy = new TidyProblem();
        int c = 1;
        for (Long number : inputNumbers) {
            String payload = "Case #" + c + ": " + tidy.previousTidyNumberIntelligent(number);
            output.println(payload);
            c++;
        }
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
