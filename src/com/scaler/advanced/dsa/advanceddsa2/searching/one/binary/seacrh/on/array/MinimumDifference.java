package com.scaler.advanced.dsa.advanceddsa2.searching.one.binary.seacrh.on.array;

/**
 * You are given a 2-D matrix C of size A × B.
 * You need to build a new 1-D array of size A by taking one element from each row of the 2-D matrix in such a way that the cost of the newly built array is minimized.
 * The cost of an array is the minimum possible value of the absolute difference between any two adjacent elements of the array.
 * So if the newly built array is X, the element picked from row 1 will become X[1], element picked from row 2 will become X[2], and so on.
 *
 * Determine the minimum cost of the newly built array.
 *
 * Input : A = 2 B = 2
 *         C = [ [8, 4]
 *               [6, 8] ]
 * Output : 0
 * Explanation : Newly build array : [8, 8].
 *               The minimum cost will be 0 since the absolute difference will be 0(8-8).
 *
 * Input : A = 3 B = 2
 *         C = [ [7, 3]
 *               [2, 1]
 *               [4, 9] ]
 * Output : 1
 * Explanation : Newly build array : [3, 2, 4].
 *               The minimum cost will be 1 since the minimum absolute difference will be 1(3 - 2).
 *
 */
public class MinimumDifference {
    public static int solve(int A, int B, int[][] C) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {

    }
}
