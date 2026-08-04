class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result  = new ArrayList<>();
        Arrays.sort(nums);
        for(int idx = 0; idx < nums.length ; idx ++){
            List<Integer> list = new ArrayList<>();
            if(idx > 0 && nums[idx-1] == nums[idx])
                continue;
            
            int l = idx+1;
            int r = nums.length -1;
            while( l < r){
                int sum  = nums[idx] + nums[l] + nums[r];
                if(sum > 0)
                    r--;
                if(sum < 0)
                    l++;

                if(sum == 0){
                    result.add(Arrays.asList(nums[idx], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                 }
            }

        }
        return result;  
    }
}
