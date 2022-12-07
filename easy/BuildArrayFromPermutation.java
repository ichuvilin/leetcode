class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (0 <= i && i < nums.length) 
                ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
