class Solution {
    public String longestCommonPrefix(String[] strs) {
        //int max = Arrays.asList(strs).stream().map(String::length).max(Integer::compareTo).get();
        int min = Arrays.asList(strs).stream().map(String::length).min(Integer::compareTo).get();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < min; i++){
            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(c != strs[j].charAt(i))
                    return sb.toString();
            }

            sb.append(c);
        }

        return sb.toString();
    }
}