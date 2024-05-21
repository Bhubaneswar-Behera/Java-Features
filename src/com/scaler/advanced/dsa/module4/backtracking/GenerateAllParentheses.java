package com.scaler.advanced.dsa.module4.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer A pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses of length 2*A.
 *
 * Input : A = 3
 * Output : [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 * Explanation : All paranthesis are given in the output list.
 *
 * Input : A = 1
 * Output : [ "()" ]
 * Explanation : All paranthesis are given in the output list.
 *
 *
 */
public class GenerateAllParentheses {
    static ArrayList<String> arrayList;
    public static ArrayList<String> generateParenthesis(int A) {

       arrayList = new ArrayList<String>();
        String str = "";
        solve(A , 0,0,str);
        return arrayList;
    }

    private static void solve(int N ,int openIndex, int closedIndex, String str) {
        if(openIndex == closedIndex && closedIndex == N){
            arrayList.add(str);
            return ;
        }



        if(openIndex < N){
            solve(N, openIndex + 1, closedIndex, str + "(");
        }
        if(closedIndex < openIndex){
            solve(N, openIndex, closedIndex + 1, str + ")");
        }
        return;

    }


    public static void generateParenthesis(int n, int opening, int closing ,char[] str) {
       int index = opening + closing;

       if(index == 2 * n){
           System.out.println(str);
       }

       if(opening > closing){
           str[index] = ')';
           generateParenthesis(n, opening,closing+1,str);
       }
       if(opening < n){
           str[index] = '(';
           generateParenthesis(n,opening+1,closing,str);
       }
        //return null;
    }

    public static void solve(int n){
       generateParenthesis(n,0,0,new char[2*n]);
    }
    public static void main(String[] args) {
        int n = 3;
        //solve(n);
        //System.out.println(Arrays.toString(solve(n)));
        System.out.println(generateParenthesis(n));
    }
}