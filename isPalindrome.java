// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= '0' && c<= '9')){
                sb.append(c);
            }
            else if(c >= 'A' && c <= 'Z'){
                sb.append(Character.toLowerCase(c));
            }
        }

        String final_string = sb.toString();

        if(final_string.length() <= 1)
            return true;

        int start = 0;
        int end = final_string.length() - 1;

        while(start < end){
            if(final_string.charAt(start) != final_string.charAt(end))
                return false;
            
            start++;
            end--;
        }

        return true;
    }
}