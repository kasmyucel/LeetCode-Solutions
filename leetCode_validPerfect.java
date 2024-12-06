// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int high = num;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid > num / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
