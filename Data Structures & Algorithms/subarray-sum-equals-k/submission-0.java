class Solution {
    public int subarraySum(int[] nums, int k) {
         int result = 0;
         Map<Integer,Integer> countMap = new HashMap<>();
         countMap.put(0,1);
         int currentSum = 0;
         for(int i = 0; i < nums.length ; i++){
            currentSum = currentSum + nums[i];
            int diff = currentSum - k;
            result = result + countMap.getOrDefault(diff,0);
            countMap.put(currentSum,countMap.getOrDefault(currentSum,0)+1);
         }

         return result;
    }

}