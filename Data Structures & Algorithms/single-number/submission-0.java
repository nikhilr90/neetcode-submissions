class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int idx =1 ; idx < nums.length; idx++){
            res = res^ nums[idx];
        }
        return res;
    }
}
