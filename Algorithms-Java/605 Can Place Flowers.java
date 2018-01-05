class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int curr = 1;
        for (int i : flowerbed) {
            if (i == 0) {
                curr++;
            } else {
                n -= (curr - 1) / 2;
                curr = 0;
            }
        }
        n -= curr / 2;
        if (n > 0) {
            return false;
        }
        return true;
    }
}
