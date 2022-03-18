package minimumCostPathProblem;

/**
 * Find minimum cost implementation with recursive approach
 */
public class RecursiveImplementation {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 12, 15, 10},
                {6, 19, 7, 11, 17},
                {8, 5, 12, 21, 32},
                {3, 20, 2, 9, 7}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(minCost(matrix, 0, 0));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int minCost(int[][] matrix, int i, int j) {
        int n = matrix.length;// Number of rows
        int m = matrix[0].length; // number of columns

        if(i == n-1 && j == m-1) {
            //if last element
            return matrix[i][j];
        } else if(i == n-1) {
            //if we have reached at end of row
            return matrix[i][j] + minCost(matrix, i, j+1);
        } else if(j == m-1) {
            //if we reach end of column
            return matrix[i][j]+ minCost(matrix, i+1, j);
        } else {
            return matrix[i][j] + Math.min(minCost(matrix, i+1, j), minCost(matrix, i, j+1)) ;
        }
    }
}
