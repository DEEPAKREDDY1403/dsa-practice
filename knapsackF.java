import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KnapsackF {

   public static void main(String[] args) {
      int weights[] = {10, 20, 30};
      int values[] = {60, 100, 120};
      int maxWeight = 50;
      TreeMap<Double, Double> itemMap = new TreeMap<>();

      // Populating the TreeMap with value-to-weight ratios as keys and weights as values
      for (int i = 0; i < 3; i++) {
         itemMap.put((double) values[i] / weights[i], (double) weights[i]);
         // key = fractional value (value/weight), value = weight
      }

      // Calculating the maximum value that can be achieved within the given maxWeight
      System.out.println(getMax(itemMap, maxWeight));
   }

   private static double getMax(TreeMap<Double, Double> itemMap, int maxWeight) {
      double totalValue = 0.0;

      // Iterating over the entries in the TreeMap in descending order of the value-to-weight ratio
      for (Map.Entry<Double, Double> entry : itemMap.descendingMap().entrySet()) {
         double ratio = entry.getKey();
         double weight = entry.getValue();

         if (maxWeight == 0) break;

         double value = ratio * weight; // Calculated value for current weight

         // If the current weight can be fully included in the knapsack
         if (weight <= maxWeight) {
            maxWeight -= weight;
            totalValue += value;
         } else {
            // If only a fraction of the current weight can be included
            totalValue += ratio * maxWeight;
            maxWeight = 0;
         }
      }

      return totalValue;
   }
}
