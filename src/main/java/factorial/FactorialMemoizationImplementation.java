package factorial;

import java.util.HashMap;
import java.util.Map;

/**
 * Factorial implementation with memoization(Top-down Dynamic Programming) approach
 */
public class FactorialMemoizationImplementation {
    private Map<Integer, Double> cache = new HashMap<Integer, Double>();

    public static void main(String[] args) {
        FactorialMemoizationImplementation obj = new FactorialMemoizationImplementation();
        long startTime=System.currentTimeMillis();
        System.out.println("Result : " + obj.calculateFactorial(150));
        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken for execution : " + (endTime - startTime));
    }

    /**
     * Calculate factorial(Top-down approach)
     *
     * @param number
     * @return
     */
    private double calculateFactorial(int number) {
        double factValue=0;
        if(number == 0) {
            return 1;
        } else if(cache.containsKey(number)){
            return cache.get(number);
        } else {
            factValue = number * calculateFactorial(number-1);
            cache.put(number, factValue);
            return factValue;
        }
    }
}
