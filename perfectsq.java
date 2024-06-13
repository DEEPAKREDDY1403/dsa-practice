import java.util.*;

public class perfectsq {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(nums(n));
    }

    private static int nums(int n) {
        int c[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // the maximum square sum up to i is (1+1+1+1...)=i
            c[i] = i;
            for (int j = 1; j * j <= i; j++) {
                c[i] = Math.min(c[i], c[i - j * j] + 1);
            }
        }
        return c[n];
    }
}
