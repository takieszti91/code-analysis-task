package org.interview;

public class MysteryFunction {
    public static void main(String[] args) {
        int[] data = {12, 4, 6, 9, 2};
        for (int i = 0; i < data.length; i++){
            data[i] = transform(data[i]);
        }
        for (int value : data) {
            System.out.println(value);
        }
    }

    private static int transform(int input){
        int result = 0;
        while (input > 0) {
            result += (input % 10) * (input % 10);
            input /= 10;
        }
        return result;
    }
}
