class Solution {
    public int minimumOneBitOperations(int n) {
          int res = n;
          
        while (n != 0) {
            n >>= 1;
            res = res^n;
        }
        return res;
    }
}
