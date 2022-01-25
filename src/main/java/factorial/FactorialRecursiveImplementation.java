package factorial;

/**
 * Factorial implementation with recursion approach
 */
public class FactorialRecursiveImplementation {
    public static void main(String[] args) {
        FactorialRecursiveImplementation obj = new FactorialRecursiveImplementation();
        long startTime=System.currentTimeMillis();
        System.out.println("Result : " + obj.calculateFactorial(150));
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken for execution : " + (endTime - startTime));
    }

    /**
     * Calculate factorial(Recursion approach)
     *
     * @param number
     * @return
     */
    private double calculateFactorial(double number) {
        if(number == 1) {
            return 1;
        }
        return (number * calculateFactorial(number -1));
    }
}
