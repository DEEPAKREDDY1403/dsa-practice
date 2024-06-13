import java.util.*;
public class digitsum {
    public static void main(String args[]) {
        int n[] = {21, 14, 29,11};  
        int sum = 0;
        for (int num : n) {
            int min = 9;
            while (num != 0) {
                int digit = num % 10;
                if (digit < min) {
                    min = digit;
                }
                num /= 10;
            }
            sum += min;
        }
        System.out.println("Sum of the smallest digits: " + sum);
    }
}
