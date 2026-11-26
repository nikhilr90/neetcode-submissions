class Solution {
    public long zeroFilledSubarray(int[] nums) {
       
       long result = 0;
       int i =0;
       int count = 0;

       for(int num: nums){
        if(num == 0)
            count++;
        else count = 0;
        result = result +count;
       }
       return result;

    }
}