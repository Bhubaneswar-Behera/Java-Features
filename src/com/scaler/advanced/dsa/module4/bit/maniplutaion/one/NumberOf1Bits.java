package com.scaler.advanced.dsa.module4.bit.maniplutaion.one;

/**
 * Write a function that takes an integer and returns the number
 * of 1 bits present in its binary representation.
 *
 * Input : 11 Output : 3
 * Explaination : 11 is represented as 1011 in binary.
 * Input : 6 Output : 2  Explaination 2: 6 is represented as 110 in binary.
 */
public class NumberOf1Bits {
    public static int numSetBitsApproach1(int A) {
        int answer = 0;
        for (int i= 0 ; i < 32;i++) {
            if(checkBits(A,i)){
                answer++;
            }
        }
        return answer;
    }
    public static int numSetBitsApproach2(int A) {
        int answer = 0;
        while (A > 0) {
            if((A >> 1) == 1){
                answer++;
            }
            A = A>>1;
        }
        return answer;
    }
    public static boolean checkBits(int A,int i){
        if((A & (1 << i)) > 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
