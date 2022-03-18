package minimumCostPathProblem;

public class TabulationImplementation {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 12, 15, 10},
                {6, 19, 7, 11, 17},
                {8, 5, 12, 21, 32},
                {3, 20, 2, 9, 7}
        };
        long startTime = System.currentTimeMillis();
        System.out.println(minCost(matrix));
        System.out.println("Time take to execute : " + (System.currentTimeMillis() - startTime));
    }

    private static int minCost(int[][] matrix) {
        int rows = matrix.length; // number of rows
        int columns = matrix[0].length; // Numbers of columns

        //Doing sum of first column
        for (int i = 0; i < columns-1; i++) {
            matrix[0][i+1] = matrix[0][i] + matrix[0][i+1];
        }

        //Doing sum of first row
        for(int j = 0; j < rows-1; j++) {
            matrix[j+1][0] = matrix[j][0] + matrix[j+1][0];
        }

        //Doing sum of remaining items
        for(int j = 1; j < rows; j++) {
            for(int i = 1; i < columns; i++) {
                int value = matrix[j-1][i] < matrix[j][i-1] ? matrix[j-1][i] : matrix[j][i-1];
                matrix[j][i] = matrix[j][i] + value;
            }
        }

        return matrix[rows-1][columns-1];
    }
}
