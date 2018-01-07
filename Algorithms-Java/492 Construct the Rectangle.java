class Solution {
    public int[] constructRectangle(int area) {
        int root = (int) Math.ceil(Math.sqrt(area));
        while (root <= area) {
            if (area % root == 0) {
                return new int[] {root, area / root};
            }
            root++;
        }
        return new int[] {area, 1};
    }
}
