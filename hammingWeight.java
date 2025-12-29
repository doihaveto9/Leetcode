// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

// Example 1:

// Input: n = 11

// Output: 3

// Explanation:

// The input binary string 1011 has a total of three set bits.

// Example 2:

// Input: n = 128

// Output: 1

// Explanation:

// The input binary string 10000000 has a total of one set bit.

// Example 3:

// Input: n = 2147483645

// Output: 30

// Explanation:

// The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

// Constraints:

// 1 <= n <= 231 - 1

class Solution {
    public int hammingWeight(int n) {
        // Instantiate result
        int result = 0;

        // Loop while n > 0
        while(n > 0){
            // If n is odd, then we have a bit that is set, so we incremenet result
            if(n % 2 == 1){
                result++;
            }

            // Divide n by 2
            n /= 2;
        }

        // return result
        return result;
    }
}