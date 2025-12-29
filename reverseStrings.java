class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i = split.length - 1; i >= 0; i--){
            if(!split[i].isBlank()){
                result.append(split[i]);
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}