package practice.algo.dp;

import java.util.Scanner;

public class DigitDecodeCounter {

    /**
     * Solution for probelm: https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/
     */

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i = 1; i <= tc; i++){
            int[] inputArray = new int[sc.nextInt()];
            String input = sc.next();
            for(int j = 0; j < inputArray.length; j++){
                inputArray[j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            System.out.println(countDigitWordCombination(inputArray));
        }

//        for(int i = 0; i < Integer.parseInt(args[0]); i++){
//
//            int[] inputArray = new int[Integer.parseInt(args[1 + i])];
//            for(int j = 0; j < inputArray.length; j++){
//                inputArray[j] = Integer.parseInt(String.valueOf(args[2 + i].charAt(j)));
//            }
//            System.out.println(countDigitWordCombination(inputArray));
//
//        }


    }



    public static int countDigitWordCombination(final int[] digits) {
        return doCountDigitWordCombination(digits, 0);
    }


    private static int doCountDigitWordCombination(final int[] digits, final int startIndex) {

        if (startIndex == digits.length - 1) {
            return 1;
        }

        if (startIndex == digits.length - 2) {
            if (canFormLetter(digits[startIndex], digits[startIndex + 1])) {
                return 2;
            }else{
                return 0;
            }
        }


        int output = 1 + doCountDigitWordCombination(digits, startIndex + 1);
        if(canFormLetter(digits[startIndex], digits[startIndex+1])){
            output += 1 + doCountDigitWordCombination(digits, startIndex + 2);
        }

        return output;

    }

    private static boolean canFormLetter(final int a, final int b) {
        return ((a * 10 + b) < 26);
    }

}
