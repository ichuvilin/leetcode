class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) a++;
            }
            ans[i] = a;
        }

        return ans;
    }
}
