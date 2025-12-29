class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative, it cannot be a palindrome
        if(x < 0)
            return false;

        // If x has only one digit, it must be a palindrome
        if(x < 10)
            return true;

        // Instantiate an array that will hold the digits of x
        ArrayList<Integer> digits = new ArrayList<>();

        int num1 = x;

        // Get each individual digit of x
        do{
            int digit = num1 % 10;
            num1 /= 10;
            digits.add(digit);
        }while(num1 > 0);

        // Instantiate a long, this is in case x reversed goes over the MAX_INTEGER limit
        long num2 = 0;

        // Add the digits to num2 in reverse order, multiplying the digit by 10 to the
        // appropriate power to ensure the result is correct
        for(int i = 0; i < digits.size(); i++){
            num2 += digits.get(digits.size() - 1 - i) * Math.pow(10, i);
        }

        // Return whether or not x is equal to num2
        return (x == num2);
    }
}