class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size  = nums.length;
        int[] result = new int[size];
        result[0] = 1;
        for(int index =1 ; index < size ; index++){
            result[index] = result[index -1 ] * nums[index -1 ];
        }

        int postfix = 1 ;
        for(int index =size-1 ; index >= 0 ; index--){
            result[index] = result[index] * postfix;
            postfix = postfix * nums[index];
        }
        return result;

    }
}  
