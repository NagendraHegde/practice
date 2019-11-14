package practice.algo.string;

public class SequenceGenerator {


    /**
     *  Generate nth number in below series:
     * * Series contains only 4s and 5s
     * * any number in the Series has only even number of digits
     * * any number in the series is a palindrome
     * * The numbers in the series are incremental
     * Example:
     * 44, 55, 4444, 4554, 5445, 5555, 444444, 445544, 454454, 455554, 555555, 44444444, 44455444, 44544544, 45444454, 54444445...
     */

    public static void main1(String[] args){
        for(int i = 1; i < 20; i++){
            System.out.println(generateNumber(i));
        }
    }


    public static String generateNumber(final int n){

        if(n < 1){
            return null;
        }

        String binStr = Integer.toBinaryString(n-1);
        binStr = binStr.replace('0','4');
        binStr = binStr.replace('1', '5');

        return appendMirror(binStr);
    }


    public static String generateNextNumber(final String num){

        char[] numArr = num.substring(0, num.length()/2).toCharArray();



        return null;
    }

    public static String appendMirror(final String num){

        String rev = new StringBuilder(num).reverse().toString();
        return new String(new StringBuilder(num).append(rev).toString());

    }



}
