class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length; int idx = 0;
        while(idx < n){
            if(nums[idx] ==val){
                nums[idx] = nums[--n];
            }else{
                idx++;
            }
        }
        return idx;
    }
}