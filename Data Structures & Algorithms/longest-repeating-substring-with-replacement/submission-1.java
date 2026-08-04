class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> charfreeq = new HashMap<Character,Integer>();
        int res =0 ; int maxFrequency =0;
        int l =0;
        for(int r =0; r < s.length(); r++){
            charfreeq.put(s.charAt(r),charfreeq.getOrDefault(s.charAt(r),0)+1);
            maxFrequency =  Math.max(maxFrequency,charfreeq.get(s.charAt(r)));
            if(r-l+1  -maxFrequency > k){
                charfreeq.put(s.charAt(l), charfreeq.get(s.charAt(l)) - 1);
                l++;    
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
