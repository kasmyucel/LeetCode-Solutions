// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public static String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "");
        StringBuilder sb = new StringBuilder(s);

        int lengthOfString = sb.length();
        for (int i = lengthOfString - k; i > 0; i -= k) {
            sb.insert(i, "-");
        }
        return sb.toString().toUpperCase();
    }
}
