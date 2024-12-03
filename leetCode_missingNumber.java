// This is one of my first year solutions in the Computer Engineering department.
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int number : nums){
            sum +=number;
        }
        int expectedSum =nums.length*(nums.length+1)/2;
        return expectedSum-sum;
        
    }
}
