package longestCmnSubSequence;

public class RecursiveImplementation {
    public static void main(String[] args) {
        String str1 = "abdacbabz";
        String str2 = "acebfcaz";
        System.out.println(longestSubSequence(str1, str2, 0, 0));
    }

    private static int longestSubSequence(String str1, String str2, int i, int j) {
        if(i >= str1.length() || j >= str2.length()) {
            return 0;
        } else if(str1.charAt(i) == str2.charAt(j)){
            return 1 + longestSubSequence(str1, str2, i+1, j+1);
        } else {
            return Math.max(longestSubSequence(str1, str2, i, j+1), longestSubSequence(str1, str2, i+1, j));
        }
    }
}
