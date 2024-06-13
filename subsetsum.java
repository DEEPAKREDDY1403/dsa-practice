import java.util.Arrays;
public class subsetsum {
    static boolean isSubsetSum(int[] set, int n, int sum) {
        boolean[] prev = new boolean[sum + 1];
        for (int i = 0; i <= n; i++)
            prev[0] = true; // i
        for (int i = 1; i <= sum; i++)
            prev[i] = false; // j
        boolean[] curr = new boolean[sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < set[i - 1])
                    curr[j] = prev[j];
                if (j >= set[i - 1])
                    curr[j] = prev[j] || prev[j - set[i - 1]];
            }
            prev = Arrays.copyOf(curr, curr.length);
        }

        return prev[sum];
    }
    public static void main(String[] args) {
        int[] set = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
            System.out.println(isSubsetSum(set, n, sum));
    }
}
