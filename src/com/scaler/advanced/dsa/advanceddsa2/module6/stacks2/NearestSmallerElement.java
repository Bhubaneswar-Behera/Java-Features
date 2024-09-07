package com.scaler.advanced.dsa.advanceddsa2.module6.stacks2;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given an array A, find the nearest smaller element G[i] for
 * every element A[i] in the array such that the element has an index smaller than i.
 *
 * More formally,
 * G[i] for an element A[i] = an element A[j] such that
 * j is maximum possible AND
 * j < i AND
 * A[j] < A[i]
 * Elements for which no smaller element exist, consider the next smaller element as -1.
 *
 * Input : A = [4, 5, 2, 10, 8]  Output : [-1, 4, -1, 2, 2]
 * Explanation :
 * index 1: No element less than 4 in left of 4, G[1] = -1
 * index 2: A[1] is only element less than A[2], G[2] = A[1]
 * index 3: No element less than 2 in left of 2, G[3] = -1
 * index 4: A[3] is nearest element which is less than A[4], G[4] = A[3]
 * index 4: A[3] is nearest element which is less than A[5], G[5] = A[3]
 *
 *
 * Input : A = [3, 2, 1]    Output : [-1, -1, -1]
 * Explanation :
 * index 1: No element less than 3 in left of 3, G[1] = -1
 * index 2: No element less than 2 in left of 2, G[2] = -1
 * index 3: No element less than 1 in left of 1, G[3] = -1
 */
public class NearestSmallerElement {
    public static int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] G = new int[n]; // Result array to store the nearest smaller elements
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the stack while the stack is not empty and
            // the top element is greater than or equal to the current element A[i]
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }

            // If stack is empty, it means there is no smaller element on the left
            if (stack.isEmpty()) {
                G[i] = -1;
            } else {
                G[i] = stack.peek(); // The top element is the nearest smaller element
            }

            // Push the current element onto the stack
            stack.push(A[i]);
        }

        return G;

    }
    public static void main(String[] args) {
        int[] A = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(prevSmaller(A)));
    }
}