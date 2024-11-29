class Solution {
    public int singleNumber(int[] nums) {
        int target =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i< nums.length; i++){
            max = max > nums[i] ? max : nums[i];
            min = min < nums[i] ? min : nums[i];
        }
        int[] numberOfNums = new int[max + Math.abs(min)+1];
        for(int i =0; i< nums.length;i++){
            numberOfNums[nums[i]+Math.abs(min)]++;
        }
        for(int i =0; i<numberOfNums.length;i++){
            if(numberOfNums[i] == 1){
                target= i - Math.abs(min);
            }
             
        }
        return target;
    }
}
