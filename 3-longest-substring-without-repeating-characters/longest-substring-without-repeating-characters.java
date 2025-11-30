class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = 0;
        int maxLength = 0;
        int start=0;
        for(int end =0; end< s.length(); end++){
            for (int k = start; k < end; k++) {
                if (s.charAt(k) == s.charAt(end)) {
                    start = k + 1;
                    break;
                }
            }
            length = end - start + 1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
        
    }
    
}