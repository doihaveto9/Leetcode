class Solution {
    public String greatestLetter(String s) {
        // char greatest = ' ';
        
        // for(int i = 0; i < s.length() - 1; i++){
        //     for(int j = i + 1; j < s.length(); j++){
        //         if(s.charAt(i) != s.charAt(j) &&
        //           (Character.toUpperCase(s.charAt(i)) == s.charAt(j) ||
        //            Character.toLowerCase(s.charAt(i)) == s.charAt(j)) &&
        //            Character.toUpperCase(s.charAt(i)) > greatest){
        //                 greatest = Character.toUpperCase(s.charAt(i));
        //            }
        //     }
        // }

        // if(greatest == ' '){
        //     return "";
        // }
        // else{
        //     return Character.toString(greatest);
        // }

        for(int i=0;i<26;i++){
            char c1=(char) ('z'-i);
            char c2=(char) ('Z'-i);
            if(s.contains(String.valueOf(c1))&&s.contains(String.valueOf(c2))){
                return String.valueOf(c2);
            }
        }
        return "";
    }
}