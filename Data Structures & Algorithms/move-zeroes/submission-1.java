class Solution {
    public void moveZeroes(int[] nums) {
       int l = 0;
       int r = 0;
       int n = nums.length;
       while(r < n && l < n){
        while( r < n && nums[r] == 0){
            r++;
        }
        if(r < n && nums[r] != 0 ){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r++;
        }

       }
        
    }
}