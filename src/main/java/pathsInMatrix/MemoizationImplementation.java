package pathsInMatrix;

public class MemoizationImplementation {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(findPaths(matrix, 0, 0, null));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int findPaths(int[][] matrix, int i, int j, Integer[][] cache) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(cache == null) {
            cache  = new Integer[rows][columns];
        }
        if((i < rows && j < columns) && cache[i][j] != null) {
            return cache[i][j];
        }

        if(i == rows || j == columns || matrix[i][j] == 1) {
            return 0;
        } else if(i == rows-1 && j == columns-1) {
            return 1;
        } else {
            cache[i][j] = findPaths(matrix, i+ 1, j, cache) + findPaths(matrix, i, j+1, cache);
            return cache[i][j];
        }
    }

}
