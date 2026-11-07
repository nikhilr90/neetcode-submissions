class Solution {
    public int[] getConcatenation(int[] nums) {
        int  n = nums.length;
        int newsize = 2 * n ;
        if(nums == null)
            return null;
        int[] res = new int[newsize];
        int j =0;
        for(int i =0 ;i < res.length ; i++){
            if(i >= n){
                res[i] = nums[j];
                j++;
            }
            else {
                res[i] = nums[i];
            }
            
        }
        return res ;
    }
}