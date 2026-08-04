class Solution {
    public int lengthOfLongestSubstring(String s) {
        if( s == null || s.length() == 0 )
            return 0;
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int result =0;
        for(int idx =0; idx < s.length(); idx ++){
            char ch = s.charAt(idx);
            while(charSet.contains(ch)){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(ch);
            result = Math.max(result,idx-l+1);
        }
        return result;
    }
}
