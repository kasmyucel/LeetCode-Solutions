// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public static void moveZeroes(int[] nums) {
        int notZeroIndex =0;
        for(int num : nums){
            if(num != 0){
                nums[notZeroIndex++] = num;
            }
        }
        for(int i = notZeroIndex; i<nums.length; i++)
           nums[i] = 0;
    }
}
