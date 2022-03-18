package pathsInMatrix;

public class TabulationImplementation {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(findPaths(matrix));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int findPaths(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        matrix[0][0] = matrix[0][0] == 0 ? 1 : 0;

        // Populate first column
        for(int j = 1; j < columns; j++) {
            matrix[0][j] = matrix[0][j] == 0 ? matrix[0][j-1] : 0;
        }

        // Populate first rows
        for(int i = 1; i < rows; i++) {
            matrix[i][0] = matrix[i][0] == 0 ? matrix[i-1][0] : 0;
        }

        // Populate remaining numbers
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < columns; j++) {
                matrix[i][j] = matrix[i][j] == 0 ? (matrix[i-1][j] + matrix[i][j-1]) : 0;
            }
        }
        return matrix[rows-1][columns-1];
    }

}
