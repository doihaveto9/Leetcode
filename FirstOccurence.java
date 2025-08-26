class Solution {
    public int strStr(String haystack, String needle) {
        // if(!hayStack.contains(needle)){
        //     return -1;
        // }

        if(haystack.equals(needle))
            return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int counter = 0;

            while((counter < needle.length()) && (haystack.charAt(i + counter) == needle.charAt(counter))){
                counter++;
            }

            if(counter == needle.length())
                return i;
        }

        return -1;
    }
}