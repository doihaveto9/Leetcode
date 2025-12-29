// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        
        // Iterate over the string backwards
        for(int i = s.length() - 1; i >= 0; i--){
            // Once you find a char that ISN'T a space
            if(s.charAt(i) != ' '){
                // Continue iterating backwards until you find a space
                // This time incrementing count for each character
                while(i >= 0 && s.charAt(i) != ' '){
                    count++;
                    i--;
                }

                // Once this is done, return count
                return count;
            }
        }

        // If no word is found, return 0
        return count;
    }
}