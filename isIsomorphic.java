// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"

// Output: true

// Explanation:

// The strings s and t can be made identical by:

// Mapping 'e' to 'a'.
// Mapping 'g' to 'd'.
// Example 2:

// Input: s = "foo", t = "bar"

// Output: false

// Explanation:

// The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

// Example 3:

// Input: s = "paper", t = "title"

// Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> check = new HashMap<>();
        Set<Character> s_set = new HashSet<>();
        Set<Character> t_set = new HashSet<>();

        if(s.length() == 1)
            return true;

        for(int i = 0; i < s.length(); i++){
            if(!s_set.contains(s.charAt(i)))
                s_set.add(s.charAt(i));
            
            if(!t_set.contains(t.charAt(i)))
                t_set.add(t.charAt(i));
        }

        if(s_set.size() != t_set.size())
            return false;


        for(int j = 0; j < s.length(); j++){
            if(check.containsKey(s.charAt(j))){
                if(check.get(s.charAt(j)) != t.charAt(j)){
                    return false;
                }
            }
            else{
                check.put(s.charAt(j), t.charAt(j));
            }
        }

        return true;
    }
}