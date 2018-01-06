//6 ms runtime beat 86.04% of java submissions

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

/* Past attempts:
13 ms
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> result = new HashSet<>();
        for (int i : nums) {
            if (!result.add(i)) {
                return true;
            }
        }
        return false;
    }
}

20 ms 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> result = new HashSet<>();
        for (int i : nums) {
            if (result.contains(i)) {
                return true;
            }
            result.add(i);
        }
        return false;
    }
}
*/

