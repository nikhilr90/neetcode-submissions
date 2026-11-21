class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1 == null || word1.length() ==0)
            return word2;
        if(word2 == null || word2.length() ==0)
            return word1;

        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();

        int i = 0; int j = 0;
        while(i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        System.out.println("op= "+sb.toString());

        if( i >= len1 && j < len2 )
            sb.append(word2.substring(j,len2));
        else if( j >= len2 && i < len1)
            sb.append(word1.substring(i,len1));
        return sb.toString();
    }
}