package longestCmnSubSequence;

public class TabulationImplementation {
    public static void main(String[] args) {
        String str1 = "abdacbabz";
        String str2 = "acebfcaz";
        //longest common sub sequence is abcaz
        System.out.println(longestSubSequence(str1, str2));
    }

    private static int longestSubSequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] cache = new int[n][m];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    cache[i][j] = 1 + cache[i-1][j-1];
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
        return cache[n-1][m-1];
    }

}
