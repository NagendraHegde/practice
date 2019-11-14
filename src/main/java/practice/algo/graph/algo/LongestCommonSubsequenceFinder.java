package practice.algo.graph.algo;

public class LongestCommonSubsequenceFinder {

    public static int getLengthOfLongestCommonSubsequence(final String str1, final String str2) {

        int[][] lcs = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }


        return lcs[str1.length()][str2.length()];

    }
}
