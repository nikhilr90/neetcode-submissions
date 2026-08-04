class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // int[128] instead of HashMap — direct ASCII index
        // zero heap allocation, cache-friendly
        int[] need   = new int[128];
        int[] window = new int[128];

        // Count required characters from t
        int required = 0;
        for (char c : t.toCharArray()) {
            if (need[c] == 0) required++; // new unique char
            need[c]++;
        }

        int have      = 0;
        int left      = 0;
        int bestLen   = Integer.MAX_VALUE;
        int bestStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;

            // Only care about chars that appear in t
            if (need[c] > 0 && window[c] == need[c]) {
                have++;
            }

            // Contract while valid
            while (have == required) {
                if ((right - left + 1) < bestLen) {
                    bestLen   = right - left + 1;
                    bestStart = left;
                }

                char lc = s.charAt(left++);
                window[lc]--;
                if (need[lc] > 0 && window[lc] < need[lc]) {
                    have--;
                }
            }
        }

        return bestLen == Integer.MAX_VALUE
                ? ""
                : s.substring(bestStart, bestStart + bestLen);
    
    }
}
