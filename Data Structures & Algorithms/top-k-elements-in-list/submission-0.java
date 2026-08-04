class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].add(element);
        }
        
        int[] result = new int[k];
        int index = 0;
        

        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            for (int num : buckets[freq]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }
        
        return result;

    }
}
