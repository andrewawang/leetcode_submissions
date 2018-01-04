import java.util.ArrayList;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (left <= right) {
            Boolean selfDivNum = true;
            for (char c : String.valueOf(left).toCharArray()) {
                int curr = Character.getNumericValue(c);
                if (curr == 0 || left % curr != 0) {
                    selfDivNum = false;
                    break;
                }
            }
            if (selfDivNum) {
                result.add(left);
            }
            left++;
        }
        
        return result;
    }
}
