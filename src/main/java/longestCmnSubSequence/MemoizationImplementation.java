package longestCmnSubSequence;

public class MemoizationImplementation {
    public static void main(String[] args) {
        String str1 = "abdacbabz";
        String str2 = "acebfcaz";
        //longest common sub sequence is abcaz
        System.out.println(longestSubSequence(str1, str2, 0, 0, null));
    }

    private static int longestSubSequence(String str1, String str2, int i, int j, Integer[][] cache) {
        if(cache == null) {
            cache = new Integer[str1.length()][str2.length()];
        }

        if(i == str1.length() || j == str2.length()) {
            return 0;
        } else if(cache[i][j] != null) {
            return cache[i][j];
        } else if (str1.charAt(i) == str2.charAt(j)){
            cache[i][j] = 1 + longestSubSequence(str1, str2, i+1, j+1, cache);
            return cache[i][j];
        } else {
            cache[i][j] = Math.max(longestSubSequence(str1, str2, i+1, j, cache), longestSubSequence(str1, str2, i, j+1, cache));
            return cache[i][j];
        }
    }

}
