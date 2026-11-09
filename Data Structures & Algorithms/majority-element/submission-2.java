class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();

        int n = nums.length;
        int count = n/2;

        for(int i= 0; i < n ; i++){
            int num = nums[i];
            if(countMap.containsKey(num)){
                countMap.put(num,countMap.get(num)+1);
            }
            else{
                countMap.put(num,1);
            }
            if(countMap.get(num) > count){
                return num;
            }
        }
        return 0;
    }
}