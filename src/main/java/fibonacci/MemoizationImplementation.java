package fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Fibonacci implementation with memoization(Top-down Dynamic Programming) approach
 */
public class MemoizationImplementation {
    private Map<Long, Long> cache = new HashMap<Long, Long>();
    public static void main(String[] args) {
        MemoizationImplementation object = new MemoizationImplementation();
        long startTime=System.currentTimeMillis();
        System.out.println("Result : " + object.calculateFib(150));
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken for execution : " + (endTime - startTime));
    }

    /**
     * Calculate Nth fib number
     * @param n
     * @return
     */
    private long calculateFib(long n) {
        long fibValue=0;
        if(n <= 1) {
            return n;
        } else if(cache.containsKey(n)){
            return cache.get(n);
        } else {
            fibValue = calculateFib(n-1) + calculateFib(n-2);
            cache.put(n, fibValue);
            return fibValue;
        }
    }
}
