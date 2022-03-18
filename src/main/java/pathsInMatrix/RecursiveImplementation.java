package pathsInMatrix;

/**
 * Problem :
 * Given a matrix where a cell has the value of 1 if it's a wall and 0 if not, find the number of
 * ways to go from the top-left cell to the bottom-right cell, knowing that it's not possible to
 * pass from a wall and we can only go to the right or to the bottom
 */
public class RecursiveImplementation {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(findPaths(matrix, 0, 0));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int findPaths(int[][] matrix, int i, int j) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(i == rows || j == columns || matrix[i][j] == 1) {
            return 0;
        } else if(i == rows-1 && j == columns-1) {
            return 1;
        } else {
            return findPaths(matrix, i+ 1, j) + findPaths(matrix, i, j+1);
        }
    }
}
