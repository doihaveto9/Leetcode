class Solution {
    public String shortestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = s.length(); i > 1; i--){
            if(palindromeCheck(s.substring(0, i))){
                sb.append(s);
                return sb.toString();
            }
            else{
                sb.append(s.charAt(i - 1));
            } 
        }

        sb.append(s);
        return sb.toString();
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