class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length ==1)
            return result;
        Map<Integer,Integer> map =new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                result[0] = map.get(sum);
                result[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        Arrays.sort(result);
        return result;

    }
}
