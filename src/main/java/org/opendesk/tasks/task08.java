package org.opendesk.tasks;/*	FrogRiverOne
	Find the earliest time when a frog can jump to the other side of a river.
	Task Score 100%, Correctness 100%, Performance 100%
	
	A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

	You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
	The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

	For example, you are given integer X = 5 and array A such that:
	  A[0] = 1
	  A[1] = 3
	  A[2] = 1
	  A[3] = 4
	  A[4] = 2
	  A[5] = 3
	  A[6] = 5
	  A[7] = 4
	In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

	Write a function:
	class Solution { public int solution(int X, int[] A); }
	that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
	If the frog is never able to jump to the other side of the river, the function should return −1.

	Assume that:
	N and X are integers within the range [1..100,000];
	each element of array A is an integer within the range [1..X].

	Complexity:
	expected worst-case time complexity is O(N);
	expected worst-case space complexity is O(X) (not counting the storage required for input arguments).	*/
	
class FrogRiverOneSolution {
    /*  We create an array of counters, which stores how many times
        this value appears at A array. Then we iterate through A,
        keeping the index as time, and if current A value changes
        corresponding counter cell from 0 to 1, we decrease X (which
        is number of jumps left to cross the river). Once the X turns to
        zero, we are done - the frog crossed the river. If we went
        through the whole array and X is still > 0, we return -1
        as it is not possible for the frog to cross the river */
    public int solution(int X, int[] A) {
        int N = A.length;
        int[] counter = new int[N+1];
        for (int time = 0; time < N; time++)
            if (A[time] > 0 && A[time] <= N) {
                counter[A[time]]++;
                if (counter[A[time]] == 1)
                    X--;
                if (X == 0)
                    return time;
            }
        if (X <= 0)
            return N;
        else
            return -1;
    }
}