class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        else if(n == 2)
            return "11";
        else if(n == 3)
            return "21";
        else if(n == 4)
            return "1211";

        String work = countAndSay(n - 1);

        StringBuilder sb = new StringBuilder();

        short count = 1;

        for(int i = 0; i < work.length() - 1; i++){
            if(work.charAt(i) == work.charAt(i + 1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(work.charAt(i));

                count = 1;
            }
        }

        sb.append(count);
        sb.append(work.charAt(work.length() - 1));

        return sb.toString();
    }
}