class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length ==0 || nums.length ==1)
            return false;
        Arrays.sort(nums);
        for(int idx =0 ; idx < nums.length; idx++){
            if(idx+1 < nums.length && nums[idx] == nums[idx+1])
                return true;
        }
        return false;
        
    }
}