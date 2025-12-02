class Solution {
    public int reverse(int x) {
        int y = 0;
        while(x!=0){
            int rem = x % 10;
            if (y > Integer.MAX_VALUE / 10 || y < Integer.MIN_VALUE / 10) {
                return 0;
            }
            x = x / 10;
            y = y * 10 + rem;
        }
        return y;
    }
}