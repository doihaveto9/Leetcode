class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        Map<Character, String> pattern_check = new HashMap<>();

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if(pattern_check.containsKey(pattern.charAt(i))){
                if(!pattern_check.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            }
            else{
                if(pattern_check.containsValue(words[i]))
                    return false;
                
                pattern_check.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }
}