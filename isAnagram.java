// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        int[] sChar = new int[26];
        int[] tChar = new int[26];

        for(char c : s.toCharArray()){
            sChar[c - 'a']++;
        }

        for(char d : t.toCharArray()){
            tChar[d - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(sChar[i] != tChar[i])
                return false;
        }

        return true;
    }
}