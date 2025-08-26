class Solution {
    public String makeFancyString(String s) {

        // If the string is not at least 3 characters long,
        // It must be "fancy"
        if(s.length() < 3){
            return s;
        }

        // Instantiate StringBuilder
        StringBuilder sb = new StringBuilder();

        // Append first 2 characters of string
        sb.append(s.substring(0, 2));

        // Iterate over string for remaining characters
        for(int i = 2; i < s.length(); i++){
            // If character at index is not the same character as the previous
            // 2, character is appended to string builder, otherwise, it is
            // ignored
            if(s.charAt(i) != s.charAt(i - 1) || s.charAt(i) != s.charAt(i - 2)){
                sb.append(s.charAt(i));
            }
        }

        // return StringBuilder value
        return sb.toString();
    }
}