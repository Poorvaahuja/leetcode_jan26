class Solution {
    int M = 1000000007;
    int n;
    Integer[][] dp;
    int nums[];
    public int specialPerm(int[] nums) {
        this.n = nums.length;
        this.dp = new Integer[n][1 << n];
        this.nums = nums;
        return backtrack(0, 0);

    }
    private int backtrack(int preIndex, int mask) {
        if (mask == (1 << n) - 1) return 1;
        if (dp[preIndex][mask] != null) return dp[preIndex][mask];
        int count = 0;
        for (int i = 0; i < n; i++)
            if ((mask & (1 << i)) == 0 && 
                (mask == 0 || nums[i] % nums[preIndex] == 0 || nums[preIndex] % nums[i] == 0))
                count = (count + backtrack(i, mask | (1 << i))) % M; //used.add(i);
        return dp[preIndex][mask] = count;
    }
}
