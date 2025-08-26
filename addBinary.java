class Solution {
    public String addBinary(String a, String b) {
        if(a.equals("0"))
            return b;
        else if(b.equals("0")){
            return a;
        }

        int carry = 0;

        int a_index = a.length() - 1;
        int b_index = b.length() - 1;

        StringBuilder sb = new StringBuilder();

        while(a_index >= 0 || b_index >= 0 || carry == 1){
            if(a_index >= 0){
                carry += a.charAt(a_index--) - '0';
            }
            if(b_index >= 0){
                carry += b.charAt(b_index--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }
}