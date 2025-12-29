// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Get the length of the shortest string in the array
        int min = Arrays.asList(strs).stream().map(String::length).min(Integer::compareTo).get();

        StringBuilder sb = new StringBuilder();

        // Set up a loop
        for(int i = 0; i < min; i++){
            // Check to see the character at i place in the first string
            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                // Check if the character is at the same position in the other strings
                if(c != strs[j].charAt(i))
                    // If not, we have found the longest prefix
                    return sb.toString();
            }

            // If so, append to StringBuilder and continue
            sb.append(c);
        }

        // In case the shortest string is present in 
        return sb.toString();
    }
}