//10ms solution beating 45.45%

class Solution {
    public int calPoints(String[] ops) {
        LinkedList<Integer> points = new LinkedList<>();
        int result = 0;
        int temp;
        for (String s : ops) {
            if (s.equals("C")) {
                result -= points.pollFirst();
            } else if (s.equals("D")) {
                temp = 2 * points.peekFirst();
                points.addFirst(temp);
                result += temp;
            } else if (s.equals("+")) {
                temp = points.peekFirst() + points.get(1);
                points.addFirst(temp);
                result += temp;
            } else {
                temp = Integer.parseInt(s);
                points.addFirst(temp);
                result += temp;
            }
        }
        return result;
    }
}

