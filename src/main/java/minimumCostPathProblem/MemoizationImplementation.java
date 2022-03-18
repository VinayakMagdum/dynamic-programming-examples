package minimumCostPathProblem;


/**
 * Find minimum cost implementation with memoization(Top-down Dynamic Programming) approach
 */
public class MemoizationImplementation {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 12, 15, 10},
                {6, 19, 7, 11, 17},
                {8, 5, 12, 21, 32},
                {3, 20, 2, 9, 7}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(minCost(matrix, 0, 0, null));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int minCost(int[][] matrix, int i, int j, Integer[][] cache) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(cache == null) {
            cache = new Integer[n][m];
        }

        if(cache[i][j] != null) {
            return cache[i][j];
        }
        if(i == n-1 && j == m-1) {
            return matrix[i][j];
        } else if(i == n-1) {
            cache[i][j] = matrix[i][j] + minCost(matrix, i, j + 1, cache);
            return cache[i][j];
        } else if(j == m-1) {
            cache[i][j] = matrix[i][j] + minCost(matrix,i + 1, j, cache);
            return cache[i][j];
        } else {
            cache[i][j] = matrix[i][j] + Math.min(minCost(matrix, i+1, j, cache),minCost(matrix, i, j+1, cache));
            return cache[i][j];
        }
    }


}
