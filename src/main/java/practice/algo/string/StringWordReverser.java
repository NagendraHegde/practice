package practice.algo.string;

public class StringWordReverser {

    public static String reverseWords(final String str) {

        char[] input = str.toCharArray();
        StringBuilder output = new StringBuilder();
        int tmp = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                for (int j = i - 1; j > tmp; j--) {
                    output.append(input[j]);
                }
                tmp = i;
                output.append(' ');
            }
        }
        for(int j = input.length - 1; j > tmp; j--){
            output.append(input[j]);
        }


        return output.toString();
    }

    public static void main1(String[] args) {
        System.out.println(reverseWords("aaaabbbb aabb ab"));
        System.out.println(reverseWords("aaaabbbb"));
        System.out.println(reverseWords("aaaabbbb   ab"));
        System.out.println(reverseWords("aaaabbbb aabb abba abab"));
    }


}
