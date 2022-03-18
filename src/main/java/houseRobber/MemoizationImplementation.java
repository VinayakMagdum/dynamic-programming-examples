package houseRobber;

public class MemoizationImplementation {

    public static void main(String[] args) {
        int[] matrix = {1, 10, 3, 6, 8, 1, 7};
        System.out.println("Max robbery amount will be : " + maxAmount(matrix, 0,null));
    }

    private static int maxAmount(int[] matrix, int i, Integer[] cache) {
        if(cache == null) {
            cache = new Integer[matrix.length];
        }

        if(i >= matrix.length) {
            return 0;
        } else if(cache[i] != null){
            return cache[i];
        } else {
            cache[i] = Math.max(matrix[i]+maxAmount(matrix, i+2, cache), maxAmount(matrix, i+1, cache));
            return cache[i];
        }
    }
}
