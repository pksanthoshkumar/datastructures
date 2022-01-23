package org.opendesk;

import java.util.ArrayList;
    /*
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
    Write a function:

    class Solution { public int solution(int N); }
    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
    Write an efficient algorithm for the following assumptions:
    N is an integer within the range [1..2,147,483,647].
     */

public class FindBinaryGap {

    public static void main(String[] args) {
        FindBinaryGapSolution s = new FindBinaryGapSolution();
        s.solution(5409);
    }
}

class FindBinaryGapSolution {
    public int solution (int N){

        //convert the integer to a binary string
        String binaryString = Integer.toBinaryString(N);

        //go through each character one by one and save the index of each 1 to a list
        ArrayList<Integer> onesList = new ArrayList <Integer> ();

        for (int i=0; i < binaryString.length();i++){
            if (binaryString.charAt(i) == '1'){
                onesList.add (i);
            }
        }

        //go through the list of 1 indices and look for the largest difference in indices

        int largestDiff = 0;

        for (int i=0; i < onesList.size() - 1; i++){
            if (onesList.get (i + 1) - onesList.get (i) > largestDiff){
                largestDiff = onesList.get (i + 1) - onesList.get (i) - 1;
            }
        }

        return largestDiff;
    }
}

