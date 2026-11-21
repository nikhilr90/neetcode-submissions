class Solution {
    public int removeDuplicates(int[] nums) {
       int prev =  0;
       int current = 1;
       int n = nums.length;

       while(current < n){
            if(nums[prev] == nums[current]){
                current++;
            }else{
                nums[prev+1] = nums[current];
                prev++;
                current++;
            }
       }
       return prev+1;
    }
}