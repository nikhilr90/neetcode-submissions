class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int result = 0, l = 0, end =people.length -1;
        while(l<=end){
            int remain = limit - people[end--];
            result++;
            if(l <= end && remain >= people[l]){
                l++;
            }
        }
        return result;
    }
}