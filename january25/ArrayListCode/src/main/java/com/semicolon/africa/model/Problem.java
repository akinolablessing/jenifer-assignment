package main.java.com.semicolon.africa.model;

import java.util.ArrayList;

public class Problem {
    private static ArrayList<Problem> listOfProblem;
    private boolean isSolved = false;
    private ProblemType problemType;

    public void setIsSolved(boolean solved) {
        this.isSolved = solved;
    }

    public boolean getIsSolved() {
        return isSolved;
    }

    public void add(Problem food) {
        listOfProblem.add(food);

    }
}
