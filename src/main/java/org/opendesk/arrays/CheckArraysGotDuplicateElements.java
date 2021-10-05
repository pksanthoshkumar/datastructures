package org.opendesk.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckArraysGotDuplicateElements {
    public static void main(String[] args) {
        CheckArraysGotDuplicateElements dup = new CheckArraysGotDuplicateElements();
        int [] intArray1 = {1, 2, 3, 5, 6, 7, 2, 8};
        int [] intArray2 = {1, 2, 3, 5, 6, 7};
        dup.hasDuplicates(intArray1);
        dup.hasDuplicates(intArray2);

        dup.hasDuplicatesBySort (intArray1) ;
        dup.hasDuplicatesBySort (intArray2);
    }

    boolean hasDuplicates (int[] dupArray ) {
        Set<Integer> hSet = new HashSet<>();

        for (int i = 0; i < dupArray.length ; i++){
            if (!hSet.add(dupArray[i])){
                System.out.println(dupArray[i] + " is a duplicate");
                return true;
            }
        }

        System.out.println("No duplicates found");
        return false;
    }

    boolean hasDuplicatesBySort (int[] intArray) {

        Arrays.sort(intArray);

        for (int i=0; i < intArray.length - 1; i++){
            if (intArray[i] == intArray[i+1]){
                System.out.println(intArray[i] + " Duplicate found by sort");
                return true;
            }
        }

        System.out.println("No duplicates found - by sort");
        return false;
    }
}
