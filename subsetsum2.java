public class subsetsum2 {

    public static void main(String[] args) {
        int arr[] = {2, 24, 4}, target = 6;
        System.out.println(subsetSumn(arr, target));
    }

    private static boolean subsetSumn(int[] arr, int target) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][target + 1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        //cols
        for (int i = 1; i <= target; i++) {
            dp[0][i] = false;
        }
        //fill
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        for (boolean[] b : dp) {
            for (boolean k : b) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        return dp[n][target];
    }
}
