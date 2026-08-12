class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        int[] freeq = new int[26];

        for(int i=0; i < s1.length(); i++){
            freeq[s1.charAt(i)-'a']++;
        }

        for(int id = 0 ; id < s2.length() ; id++){
            
            int window = 0; int j = id ;
            int[] windfreeq = new int[26];
            while(window < s1.length()  && j < s2.length()){
                windfreeq[s2.charAt(j) - 'a']++;
                window++; 
                j++;
            }

            if(checkFreeqSame(freeq,windfreeq))
                return true;
            
        }

        return false;
    }

    public boolean checkFreeqSame(int[] wind1, int[] wind2){
        for(int i =0 ; i < 26 ;i++){
            if(wind1[i] != wind2[i])
                return false;
        }
        return true;
    }
}
