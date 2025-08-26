class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        
        int size = s.length();

        while(size > 1){
            for(int i = 0; i <= s.length() - size; i++){
                if(palindromeCheck(s.substring(i, i + size))){
                    return s.substring(i, i + size);
                }
            }

            size--;
        }

        return s.substring(0, 1);
    }

    public boolean palindromeCheck(String s){
        int index = 0;

        for(int end = s.length() - 1; end > index; end--){
            if(s.charAt(index) != s.charAt(end)){
                return false;
            }
            index++;
        }

        return true;
    }
}