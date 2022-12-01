public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prev = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int n = target - nums[i];
			if (prev.containsKey(nums[i])) {
				return new int[] {prev.get(nums[i]), i};
			} 
			prev.put(n, i);
		}
		return null;
    }
}