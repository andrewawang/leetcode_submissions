class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> result = new TreeSet<>();
        for (int i : nums) {
            result.add(i);
            if (result.size() > 3) {
                result.pollFirst();
            }
        }
        if (result.size() < 3) {
            return result.pollLast();
        }
        return result.pollFirst();
    }
}
