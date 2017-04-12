package org.aspanu.codejam2017.pancakeproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aspanu on 4/9/17.
 */
public class PancakeInputIngest {
    private List<ArrayList<Boolean>> problems;
    private List<Integer> ks;
    private int numProblems;
    private Scanner scanner;

    public PancakeInputIngest() {
        scanner = new Scanner(System.in);
        problems = new ArrayList<ArrayList<Boolean>>();
        ks = new ArrayList<Integer>();
    }

    public void init() {
        numProblems = scanner.nextInt();

    }



    public int getNumProblems() {
        return numProblems;
    }

    public ArrayList<Boolean> toBinary(String input) {
        return null;
    }
}
