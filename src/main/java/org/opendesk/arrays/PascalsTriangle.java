package org.opendesk.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        /**
         * Example of a Pascals Traiangle
         *
         * 1
         * 1  1
         * 1  2  1
         * 1  3  3  1
         * 1  4  6  4  1
         * 1  5  10 10 5  1
         */

        PascalsTriangle pt = new PascalsTriangle();
        pt.getPascalsTriangle(10);
    }

    public List <List<Integer>> getPascalsTriangle (int numRows) {
        List <List <Integer>> theTriangle = new ArrayList();
        List <Integer> firstRow = new ArrayList ();
        firstRow.add (1);
        theTriangle.add(firstRow);

        for (int i=1; i < numRows; i++){
            List <Integer> prevRow = theTriangle.get(i - 1);
            List <Integer> currentRow = new ArrayList ();
            currentRow.add(1);

            for (int p=0; p < prevRow.size() - 1; p++){
                if (prevRow.size() == 1){
                    currentRow.add (prevRow.get(p));
                }else{
                    currentRow.add (prevRow.get(p) + prevRow.get(p + 1));
                }
            }

            currentRow.add(1);
            theTriangle.add(currentRow);
        }

        theTriangle.forEach(row -> System.out.println(row + "\n"));
        return theTriangle;
    }
}
