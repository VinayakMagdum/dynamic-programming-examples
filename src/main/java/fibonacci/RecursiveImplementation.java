package fibonacci;

/**
 * Fibonacci implementation with recursion approach
 */
public class RecursiveImplementation {
    public static void main(String[] args) {
        RecursiveImplementation object = new RecursiveImplementation();
        long startTime=System.currentTimeMillis();
        System.out.println("Result : " + object.calculateFib(50));
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken for execution : " + (endTime - startTime));

    }

    /**
     * Calculate Nth fib number
     * @param n
     * @return
     */
    private long calculateFib(long n) {
        if(n <= 1) return n;
        return calculateFib(n-1) + calculateFib(n-2);
    }
}
