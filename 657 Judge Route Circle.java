//12 ms runtime, beat 94.09% of java submissions.

class Solution {
    public boolean judgeCircle(String moves) {
        int leftCount = 0;
        int rightCount = 0;
        int upCount = 0;
        int downCount = 0;
        
        for (char c : moves.toCharArray()) {
            switch(c) {
                case 'L':
                    leftCount++;
                    break;
                case 'R':
                    rightCount++;
                    break;
                case 'U':
                    upCount++;
                    break;
                case 'D':
                    downCount++;
                    break;
            }
        }
        return leftCount == rightCount && upCount == downCount;
    }
}
