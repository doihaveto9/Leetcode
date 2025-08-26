class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == 'M')
                result += 1000;
            else if(c == 'D')
                result += 500;
            else if(c == 'C'){
                if(i != (s.length() - 1)){
                    if(s.charAt(i + 1) == 'M'){
                        result += 800;
                        i++;
                    }
                    else if(s.charAt(i + 1) == 'D'){
                        result += 300;
                        i++;
                    }
                }
                
                result += 100;
            }
            else if(c == 'L')
                result += 50;
            else if(c == 'X'){
                if(i != (s.length() - 1)){
                    if(s.charAt(i + 1) == 'C'){
                        result += 80;
                        i++;
                    }
                    else if(s.charAt(i + 1) == 'L'){
                        result += 30;
                        i++;
                    }
                }

                result += 10;
            }
            else if(c == 'V')
                result += 5;
            else if(c == 'I'){
                if(i != (s.length() - 1)){
                    if(s.charAt(i + 1) == 'X'){
                        result += 8;
                        i++;
                    }
                    else if(s.charAt(i + 1) == 'V'){
                        result += 3;
                        i++;
                    }
                }

                result += 1;
            }
        }

        return result;
    }
}