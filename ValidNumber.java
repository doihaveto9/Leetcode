class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
    
        // Instantiate flags that will determine if number is valid or not
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;

        // Begin iterating over string
        for(int i=0; i<s.length(); i++) {
            // If character at index is number, mark the number is seen
            // and that number after e is seen, this is in case the string
            // does not contain e so it won't flag that as a problem
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;


            // If character is a decimal, and we have either seen a point
            // or an e already, immediately return false, as number is invalid
            } else if(s.charAt(i) == '.') {
                if(eSeen || pointSeen) {
                    return false;
                }

                // Otherwise, mark pointSeen as true, in case another decimal appears
                pointSeen = true;

            // If character is an exponent
            } else if(s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                // If we've already seen an e or haven't seen a number yet,
                // return false
                if(eSeen || !numberSeen) {
                    return false;
                }

                // Otherwise, mark numberAfterE as false, as we now know we are
                // dealing with a potential exponent, likewise, mark eSeen as true
                numberAfterE = false;
                eSeen = true;

            // If character is a positive or negative sign
            } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
                // If this is not the first character of the string, or if the previous
                // character was not an exponent, return false
                if(i != 0 && ((s.charAt(i-1) != 'e') && (s.charAt(i-1) != 'E'))) {
                    return false;
                }

            // Under any other circumstance, immediately return false
            } else {
                return false;
            }
        }
        
        // If it finishes iterating without throwing false, the final result
        // is an AND gate between numberSeen and numberAfterE, if both are true
        // result is True, otherwise, result is false
        return numberSeen && numberAfterE;
    }
}

