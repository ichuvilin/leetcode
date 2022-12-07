class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <= i; j++) {
                ans[i] += nums[j];
            }
        }

        return ans;
    }
}
