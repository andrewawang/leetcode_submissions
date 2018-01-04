class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String result = "";
        for (String str : split) {
            result += new StringBuilder(str).reverse().toString() + " ";
        }
        return result.substring(0, result.length() - 1);
    }
}
