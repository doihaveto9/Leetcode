class Solution {
    public int divide(int dividend, int divisor) {
        if(Math.abs(dividend) < Math.abs(divisor)){
            return 0;
        }

        if(dividend < 0 ^ divisor < 0){
            return (Math.min(Integer.MIN_VALUE, -1 * divide(Math.abs(dividend), Math.abs(divisor))));
        }

        return(Math.max(Integer.MAX_VALUE, 1 + divide(dividend - divisor, divisor)));
    }
}