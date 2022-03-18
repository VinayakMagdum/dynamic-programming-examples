package houseRobber;

public class RecursiveImplementation {

    public static void main(String[] args) {
        int[] matrix = {1, 10, 3, 6, 8, 1, 7};
        System.out.println("Max robbery amount will be : " + maxAmount(matrix, 0));
    }

    private static int maxAmount(int[] matrix, int i) {
        if(i >= matrix.length) {
            return 0;
        }
        return Math.max((matrix[i] + maxAmount(matrix, i+2)), maxAmount(matrix, i+1));
    }

}
