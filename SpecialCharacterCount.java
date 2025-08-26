class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        for(int i = 0; i < 26; i++){
            char c1=(char) ('a' + i);
            char c2=(char) ('A' + i);

            if(word.contains(String.valueOf(c1)) && word.contains(String.valueOf(c2)))
                count++;
        }

        return count;
    }
}