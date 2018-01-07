class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> result = new HashMap<>();
        for (int i : nums) {
            if (result.containsKey(i)) {
                result.put(i, false);
            } else {
                result.put(i, true);
            }
        }
        for (Map.Entry<Integer, Boolean> entry : result.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return 0;
        
    }
}
