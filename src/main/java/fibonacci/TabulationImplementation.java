package fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Fibonacci implementation with tabulation(Bottom-up Dynamic Programming) approach
 */
public class TabulationImplementation {
    public static void main(String[] args) {
        TabulationImplementation object = new TabulationImplementation();
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
    private long calculateFib(int n) {
        Map<Integer, Long> cache = new HashMap<Integer, Long>();
        cache.put(0, new Long(0));
        cache.put(1, new Long(1));
        for(int index = 2; index <= n; index++) {
            Long value = cache.get(index-1) + cache.get(index-2);
            cache.put(index, value);
        }
        return cache.get(n);
    }

}
