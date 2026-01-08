import java.lang.Math;
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        int quotient = 0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        if(b==1){
            return negative ?(int) -a: (int) a;
        }
        while(a >= b){
            a-=b;
            quotient+=1;
        }

        return negative ? -quotient : quotient;
    }
}