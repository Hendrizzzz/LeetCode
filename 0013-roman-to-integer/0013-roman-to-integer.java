class Solution {
    private static final int M = 1000;
    private static final int D = 500;
    private static final int C = 100;
    private static final int L = 50;
    private static final int X = 10;
    private static final int V = 5;
    private static final int I = 1;
    public static int romanToInt(String s) {
        int value = 0;
        int temp = 0;

        char[] letters = String.valueOf(s).toCharArray();

        for (char a : letters){
            switch (a){
                case 'M' -> {
                    if (temp == C) value += M - temp - temp;
                    else {
                        value += M;
                    }
                    temp = 0;
                }
                case 'D' -> {
                    if (temp == C) value += D - temp - temp;
                    else {
                        value += D;
                    }
                    temp = 0;
                }
                case 'C' -> {
                    if (temp == X) {
                        value += C - temp - temp;
                        temp = 0;
                    }
                    else {
                        value += C;
                        temp = C;
                    }
                }
                case 'L' -> {
                    if (temp == X) {
                        value += L - temp - temp;
                    }
                    else {
                        value += L;
                    }
                    temp = 0;
                }
                case 'X' -> {
                    if (temp == I) value += X - temp - temp;
                    else {
                        value += X;
                        temp = X;
                    }
                }
                case 'V' -> {
                    if (temp == I) value += V - temp - temp;
                     else {
                         value += V;
                    }
                    temp = 0;
                }
                case 'I' -> {
                    value += 1;
                    temp = I;
                }
            }
        }
        return value;
    }
}