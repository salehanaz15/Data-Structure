public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AACADB";
        String s2 = "BDACAA";
        int m = s1.length();
        int n = s2.length();
        lcs_algo(s1, s2, m, n);
    }
    public static void lcs_algo(String S1, String S2, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        int index = L[m][n];
        char[] lcs_algo = new char[index + 1];