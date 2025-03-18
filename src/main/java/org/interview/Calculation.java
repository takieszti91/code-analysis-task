package org.interview;

public class Calculation {
    public static void main(String[] args) {
        int[] data = {12, 4, 6, 9, 2, -99};
        for (int value : data){
            System.out.println(sumOfSquaredRemainders(value));
        }
    }

    private static int sumOfSquaredRemainders(int input){
        int result = 0;
        input = Math.abs(input);
        while (input > 0) {
            int remainder = input % 10;
            result += remainder * remainder;
            input /= 10;
        }
        return result;
    }
}
