package houseRobber;

public class TabulationImplementation {
    public static void main(String[] args) {
        int[] matrix = {1, 10, 3, 6, 8, 1, 7};
        System.out.println("Max robbery amount will be : " + maxAmount(matrix));
    }

    private static int maxAmount(int[] matrix) {
        int[] cache = new int[matrix.length];
        cache[0]  = matrix[0];
        cache[1] = matrix[0] > matrix[1] ? matrix[0] : matrix[1];
        for (int i = 2; i < matrix.length; i++) {
            cache[i] = Math.max(matrix[i]+ cache[i-2], cache[i-1]);
        }
        return cache[cache.length-1];
    }
}
