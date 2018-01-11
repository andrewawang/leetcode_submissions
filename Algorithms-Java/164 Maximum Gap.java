//3 ms runtime beat 94.25% of java submissions

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int delta;
        for (int i = 1; i < nums.length; i++) {
            delta = nums[i] - nums[i - 1];
            if (delta > result) {
                result = delta;
            }
        }
        return result;
    }
}
