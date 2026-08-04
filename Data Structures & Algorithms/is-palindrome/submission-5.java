class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().length() == 0)
            return true;
        s = s.toLowerCase();
        s = s.trim();
        int start = 0 ;
        int end  = s.length() -1 ;
        while(start < end){

            while(start < end && ! alphaNum(s.charAt(start)))
                start++;
            
            while(start < end && ! alphaNum(s.charAt(end)))
                end--;
            
            if( s.charAt(start) != s.charAt(end))
                return false;
            
            start++;
            end--;

        }
        return true;

    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
