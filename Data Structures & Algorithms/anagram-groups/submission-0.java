class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> isProcessed = new HashSet<>();
        List<List<String>> result= new ArrayList<List<String>>();

        for(int i =0 ; i < strs.length ;i ++ ){
            if(!isProcessed.contains(strs[i])){
                List<String> list= new ArrayList<String>();
                list.add(strs[i]);
                isProcessed.add(strs[i]);
                for(int j=i+1 ; j < strs.length ; j++){
                    if(isAnagram(strs[i],strs[j])){
                        list.add(strs[j]);
                        isProcessed.add(strs[j]);
                    }
                }
                result.add(list);
            }
        }
        return result;
    }

    public boolean isAnagram(String s1, String s2){
        if(s1 == null || s2 == null )
            return false;
        if(s1.length() != s2.length())
            return false;
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        s1 = new String(charArray1);
        s2 = new String(charArray2);
        for(int idx =0 ; idx < s1.length() ; idx ++ ){
            if(s1.charAt(idx) != s2.charAt(idx))
                return false;
        }
        return true;
    }
}
