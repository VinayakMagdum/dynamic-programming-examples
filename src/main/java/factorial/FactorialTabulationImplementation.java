package factorial;

import java.util.HashMap;
import java.util.Map;

/**
 * Factorial implementation with tabulation(Bottom-up Dynamic Programming) approach
 */
public class FactorialTabulationImplementation {
    public static void main(String[] args) {
        FactorialTabulationImplementation obj = new FactorialTabulationImplementation();
        long startTime=System.currentTimeMillis();
        System.out.println("Result : " + obj.calculateFactorial(150));
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken for execution : " + (endTime - startTime));
    }

    /**
     * Calculate factorial(Bottom up approach)
     *
     * @param number
     * @return
     */
    private double calculateFactorial(int number) {
        Map<Integer, Double> cache = new HashMap<Integer, Double>();
        cache.put(0, new Double(1));
        cache.put(1, new Double(1));
        for (int i = 2; i <= number; i++) {
            cache.put(i, i*cache.get(i-1));
        }
        return cache.get(number);
    }
}
