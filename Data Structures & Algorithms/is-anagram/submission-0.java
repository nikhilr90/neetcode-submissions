class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t == null)
            return true;

        if(s == null || t == null )
            return false;
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> countMap = new HashMap<>();
        for(int idx = 0; idx < s.length() ; idx ++){
            char c = s.charAt(idx);
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }else{
                countMap.put(c,1);
            }
        }

        for(int idx = 0; idx < t.length() ; idx ++){
            char c = t.charAt(idx);
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)-1);
            }else{
               return false;
            }
        }


        for (Map.Entry<Character,Integer> mapElement : countMap.entrySet()) {
            if(mapElement.getValue() > 0 || mapElement.getValue() <0)
                return false;
        }
        return true;

    }
}
