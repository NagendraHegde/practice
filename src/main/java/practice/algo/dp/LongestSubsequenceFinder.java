package practice.algo.dp;

public class LongestSubsequenceFinder {

    public static int getLongestCommonSubsequence(final String str1, final String str2) {
        return doGetLongestCommonSubsequence(str1.toCharArray(), str2.toCharArray(), str1.length() - 1, str2.length() - 1);
    }

    public static int getLongestPalindromicSequence(final String str) {
        return doGetLongestCommonSubsequence(str.toCharArray(), new StringBuilder(str).reverse().toString().toCharArray(),
                str.length() - 1, str.length() - 1);
    }

    private static int doGetLongestCommonSubsequence(final char[] str1, final char[] str2, final int m, final int n) {

        if (m == -1 || n == -1) {
            return 0;
        }

        if (str1[m] == str2[n]) {
            return 1 + doGetLongestCommonSubsequence(str1, str2, m - 1, n - 1);
        }

        return Math.max(doGetLongestCommonSubsequence(str1, str2, m - 1, n), doGetLongestCommonSubsequence(str1, str2, m, n - 1));

    }

    public static void main(String[] args) {
//        System.out.println(getLongestCommonSubsequence("abcdefgh", "xyzaoekbpqlcpled"));
//        System.out.println(getLongestCommonSubsequence("abcdefgh", "abcdefgh"));
//        System.out.println(getLongestCommonSubsequence("abcdefgh", "pqrstuv"));
//        System.out.println(getLongestCommonSubsequence("abcdefgh", "pqrstuvh"));
        System.out.println(getLongestPalindromicSequence("pakbcdtefgkhp"));
    }


}
