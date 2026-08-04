class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        result[0] = 1;
        for(int idx =1 ; idx < size ; idx ++){
            result[idx] =result[idx-1] * nums[idx-1];
        }

        int postfix = 1;
        for(int idx =size -1  ; idx >= 0 ; idx --){
            result[idx] = postfix * result[idx];
            postfix = postfix *  nums[idx];
        }
        return result;
    }
}  
