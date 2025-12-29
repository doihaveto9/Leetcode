class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // We will go about this problem by counting the number of
        // each character in the ransom note, and the number of
        // each character in the magazine
        int[] rNoteChars = new int[26];
        int[] mChars = new int[26];

        // Counts how many times each character a-z appears in the note
        for(char c : ransomNote.toCharArray()){
            rNoteChars[c - 'a']++;
        }

        // Does the same for the magazine
        for(char d : magazine.toCharArray()){
            mChars[d - 'a']++;
        }

        // Now we compare the counts of both the magazine and the note
        for(int i = 0; i < 26; i++){
            // If the note has more of any character than the magazine
            // return false
            if(rNoteChars[i] > mChars[i])
                return false;
        }

        // Otherwise, return true
        return true;
    }
}