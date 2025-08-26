class Solution {
    public int myAtoi(String s) {
        final int len = s.length();

        // If there is no string, return 0;
        if(len == 0){
            return 0;
        }

        // Instantiate index
        int index = 0;

        // Ignore leading white space
        while(index < len && s.charAt(index) == ' '){
            index++;
        }

        // Instatiate boolean which will confirm if result is negative or not
        boolean neg = false;

        // If the string does not consist of only white space, check to see
        // if there is a leading '-' or '+', if '-', the result will be negative
        if(index < len){
            if(s.charAt(index) == '-'){
                neg = true;
                index++;
            }
            else if(s.charAt(index) == '+'){
                index++;
            }

        }

        // Instantiate result value
        int result = 0;

        // While index is less than length and the index points to a digit
        while(index < len && isDigit(s.charAt(index))){
            // convert char at index to byte for digit
            byte digit = (byte)(s.charAt(index) - '0');

            // result will be multiplied by 10 later to add in additional digits
            // This statement checks to see if result is greater than or equal to
            // what the max value of an Integer can be divided by 10. If it is, then
            // multiplying it will cause overflow.
            if(result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
                // If overflow detection is triggered, neg boolean is checked,
                // If true, result is negative, and Integer min value is returned
                // If false, result is positive, and Integer max value is returned
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            // If overflow will not be triggered, then result is multiplied by 10
            // to accomodate the new digit
            result = (result * 10) + digit;

            // Index is increased
            index++;
        }

        // Result is returned as negative or positive depending on neg boolean
        return neg ? -result : result;
    }

    // Custom function written to check if character is digit
    private boolean isDigit(char c){
    return (c >= '0' && c <= '9');
}
}

